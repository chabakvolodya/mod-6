package com.goit.module6;

import com.goit.module6.Exception.*;

/**
 * Created by Администратор on 11.01.2016.
 */
public class Car {
    private String name;
    private Driver driver;
    private Engine engine;
    private int range;
    private boolean driverGrafted;
    private double gasoline;
    private Category category;

    public Car(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setDriverGrafted(boolean driverGrafted) {
        this.driverGrafted = driverGrafted;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public String getName() {
        return name;
    }

    public Driver getDriver() {
        return driver;
    }

    public int getRange() {
        return range;
    }

    public boolean isDriverGrafted() {
        return driverGrafted;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public double getGasoline() {
        return gasoline;
    }

    public void setGasoline(double gasoline) {
        this.gasoline = gasoline;
    }

    public void go() throws CarException {
        if (driver == null) throw new DriverNotFoundException();
        if (engine == null) throw new EngineNotFoundException();
        if (getGasoline() <= 0.0) throw new GasolineNotFoundException();
        if (engine.isStatus() != true) throw new EngineNotStartException(engine.isStatus());
        if (driver.getCategory() != category) throw new CategoryDriverNotEqualCategoryCar(category, driver.getCategory());
        if (driverGrafted != true) throw new DriverNotGraftedException();
        System.out.println("Автомобіль рушив!");
    }

    public void stop(){
        System.out.println("Автомобіль зупинився!");
    }
}
