package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void printMovable(Movable movable){

        movable.move();

        if(movable instanceof Human){
            ((Human) movable).speak();
        }

        if(movable instanceof Car){
            ((Car) movable).honk();
        }

        if(movable instanceof Dog){
            ((Dog) movable).bark();
        }


    }

    public static void main(String[] args) {

        List<Movable> movableList = new ArrayList<>();
        movableList.add( new Human());
        movableList.add( new Car());
        movableList.add( new Dog());

        for(Movable movable:movableList){
            printMovable(movable);
        }


    }
}