package com.blockwit.learn1.AndrewSerg;

public class Task2 {
    public static void main(String[]args){
        Planet[]planets={
                new Planet("Земля"),
                new Planet("Марс"),
                new Planet("Юпитер")
        };
        for(int i=0;i< planets.length;i++){
            planets[i].sphere();
        }
    }
}
