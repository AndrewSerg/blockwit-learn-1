package com.blockwit.learn1.AndrewSerg;

public class Task4 {
    public static void main(String[]args){
        Animal animal= new Animal(2007, "белый","cat" );
        System.out.println("Название " + animal.getName());
        System.out.println("цвет "+ animal.getColor());
        System.out.println("возраст "+ animal.getAge() + " лет");
    }
}
