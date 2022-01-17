package com.blockwit.learn1.AndrewSerg;

public class Task1 {
    public static void main(String[] args) {

        Airplane[] airplanes = {
                new Airplane("Boeing 737", "белый", 1968),
                new Airplane("ту 134", "серый", 1966),
                new Airplane("Airbus А380", "синий", 2007)
        };
        for (int i = 0; i < airplanes.length; i++) {
            System.out.println("Название " + airplanes[i].getName() + " цвет " + airplanes[i].getColor() + " год выпуска " + airplanes[i].getYearRelease());
        }
    }
}
