package org.example;

public class Dog implements Movable{

    private String type;

    public void bark(){
        System.out.println("dog is barking.");
    }

    @Override
    public void move() {
        System.out.println("Dog is running.");
    }
}
