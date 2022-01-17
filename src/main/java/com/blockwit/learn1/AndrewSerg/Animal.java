package com.blockwit.learn1.AndrewSerg;

public class Animal {
    int Age;
    String Color, Name;

    public Animal(int inputAge, String inputColor, String inputName) {
        Age = inputAge;
        Color = inputColor;
        Name = inputName;
    }

    public int getAge() {
        return 2022 - Age;
    }

    public String getColor() {
        return Color;
    }

    public String getName() {
        return Name;
    }
}
