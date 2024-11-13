/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfacemultilevelduck;

interface Aquatic {
    void swim();
}

interface Bird {
    void fly();
}

class Duck implements Aquatic, Bird {

    @Override
    public void swim() {
        System.out.println("Duck swims in the water.");
    }

    @Override
    public void fly() {
        System.out.println("Duck flies in the sky.");
    }
}

public class InterfaceMultilevelDuck {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.swim();
        duck.fly();
    }
}
