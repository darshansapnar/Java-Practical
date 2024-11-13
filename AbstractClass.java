/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstractclass;

abstract class Animal{
    abstract void makeSound();
    
    public void eat(){
        System.out.println("i can eat");
    }
}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("dog barks");
    }
}


public class AbstractClass {

    public static void main(String[] args) {
       Dog d1 = new Dog();
       d1.makeSound();
       d1.eat();
    }
}
