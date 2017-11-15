package com.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by Маша on 16.10.2017.
 */
public class Mersedes implements Car {

    private String color;
    private int wheel;
    private float motor;
    @Qualifier("driverVasia")
    @Autowired
    private Driver driver;

    public Mersedes(String color, int wheel, float motor) {
        this.color = color;
        this.wheel = wheel;
        this.motor = motor;
    }

    public void go() {
        System.out.println("Car Mersedes have color: " + color);
        System.out.println("Car Mersedes have wheel: " + wheel);
        System.out.println("Car Mersedes have motor: " + motor);
    }

    public void driverInfo(){
        driver.dataDriver();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        color = color;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public float getMotor() {
        return motor;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
