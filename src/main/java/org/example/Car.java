package org.example;

public class Car implements Movable{

    private String model;

    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }

    public void honk(){
        System.out.println("Car is honking the horn.");
    }

    @Override
    public void move() {
        System.out.println("Car is driving.");
    }
}
