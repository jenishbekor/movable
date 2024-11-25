package org.example;

public class Human implements Movable{

    private String name;

    public void speak(){
        System.out.println("Human is speaking.");
    }

    @Override
    public void move() {
        System.out.println("Human is walking.");
    }
}
