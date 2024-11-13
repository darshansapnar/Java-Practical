/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfacemultiplebird;

interface Aquatic {
    void swim();
}

interface Bird {
    void fly();
}

class Duck implements Aquatic, Bird {
    public void swim() {
        System.out.println("The duck swims in the water.");
    }

    public void fly() {
        System.out.println("The duck flies in the sky.");
    }

    public void quack() {
        System.out.println("The duck quacks.");
    }
}

public class InterfaceMultipleBird{
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.swim();
        duck.fly();
        duck.quack();
    }
}
