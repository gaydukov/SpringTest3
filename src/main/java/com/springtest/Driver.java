package com.springtest;

/**
 * Created by Маша on 16.10.2017.
 */
public class Driver {
    private String name;
    private int age;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void dataDriver() {
        System.out.println("Driver name: "+name);
        System.out.println("Driver age: "+age);
    }
}
