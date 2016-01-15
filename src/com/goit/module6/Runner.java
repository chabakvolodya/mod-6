package com.goit.module6;

import com.goit.module6.Exception.*;

/**
 * Created by Администратор on 11.01.2016.
 */
public class Runner {
    public static void main(String[] args){

        Driver driver = new Driver("Володя", 21, Category.C);
        Engine engine = new Engine(false);

        Car car = new Car("Golf 5", Category.C);

        car.setDriver(driver);
        car.setEngine(engine);
        car.setGasoline(15);
//        car.setDriverGrafted(true);
        engine.setStatus(true);

        try {
            car.go();
        } catch (CarException e){
            CarProcessException(e);
        }

//        car.stop();
    }
    private static void CarProcessException(CarException e){

        if (e instanceof EngineNotStartException){
            System.err.println("Автомобіль не може рушити так як двигун [ " + ((EngineNotStartException) e).isStatus() + " ] не працює!");
        } else if (e instanceof DriverNotFoundException) {
            System.err.println("Автомобіль не рушить без водія!");
        } else if (e instanceof EngineNotFoundException) {
            System.err.println("Автомобіль не рушить без двигуна!");
        } else if (e instanceof GasolineNotFoundException) {
            System.err.println("Автомобіль не рушить без бензину!");
        } else if (e instanceof CategoryDriverNotEqualCategoryCar) {
            System.err.println("Автомобіль не рушить!");
            System.err.println("Категорія водія [" + ((CategoryDriverNotEqualCategoryCar)e).getCategoryDriver() + "] не сумісна з категорією [" + ((CategoryDriverNotEqualCategoryCar)e).getCategoryCar()+ "] у автомобіля!");
        } else if (e instanceof DriverNotGraftedException) {
            System.err.println("Автомобіль не рушить поки водій не пристегнут!");
        }

    }
}
