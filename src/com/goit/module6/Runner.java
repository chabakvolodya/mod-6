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
        } catch (EngineNotStartException e) {
            System.err.println("Автомобіль не може рушити так як двигун [ " + e.isStatus() + " ] не працює!");
        } catch (DriverNotFoundException e) {
            System.err.println("Автомобіль не рушить без водія!");
        } catch (EngineNotFoundException e) {
            System.err.println("Автомобіль не рушить без двигуна!");
        } catch (GasolineNotFoundException e) {
            System.err.println("Автомобіль не рушить без бензину!");
        } catch (CategoryDriverNotEqualCategoryCar e) {
            System.err.println("Автомобіль не рушить!");
            System.err.println("Категорія водія [" + e.getCategoryDriver() + "] не сумісна з категорією [" + e.getCategoryCar()+ "] у автомобіля!");
        } catch (DriverNotGraftedException e) {
            System.err.println("Автомобіль не рушить поки водій не пристегнут!");
        }


//        car.stop();
    }
}
