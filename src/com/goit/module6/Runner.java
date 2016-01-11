package com.goit.module6;

import com.goit.module6.Exception.DriverNotFoundException;
import com.goit.module6.Exception.EngineNotStartException;
import com.goit.module6.Exception.GasolineNotFoundException;

/**
 * Created by Администратор on 11.01.2016.
 */
public class Runner {
    public static void main(String[] args){

        Driver driver = new Driver("Володя", 21, Category.B);
        Engine engine = new Engine(false);

        Car car = new Car("Golf 5", Category.B);

        car.setDriver(driver);
        car.setEngine(engine);
        car.setGasoline(15);
        car.setDriverGrafted(true);
//        engine.setStatus(true);

        try {
            car.go();
        }catch (EngineNotStartException e) {
            System.err.println("Автомобіль не може рушити так як двигун [ " + e.isStatus() + " ] не працює!");
        }


//        car.stop();
    }
}
