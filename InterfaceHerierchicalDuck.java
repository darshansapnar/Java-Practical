/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaceherierchicalduck;

interface Aquatic {
    void swim();
}

interface Bird {
    void fly();
}

class Animal {
    void sound() {
        System.out.println("Animals make sound.");
    }
}

class Duck extends Animal implements Aquatic, Bird {

    @Override
    public void swim() {
        System.out.println("Duck swims in the water.");
    }

    @Override
    public void fly() {
        System.out.println("Duck flies in the sky.");
    }
}

class Penguin extends Animal implements Aquatic {

    @Override
    public void swim() {
        System.out.println("Penguin swims in the water.");
    }
}

public class InterfaceHerierchicalDuck {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.sound();
        duck.swim();
        duck.fly();
        
        Penguin penguin = new Penguin();
        penguin.sound();
        penguin.swim();
    }
}

