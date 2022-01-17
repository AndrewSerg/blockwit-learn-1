package com.blockwit.learn1.AndrewSerg;

public class Airplane {

    String Name;
    String Color;
    int YearRelease;

    public Airplane(String inputName, String inputColor, int inputYearRelease) {
        Name = inputName;
        Color = inputColor;
        YearRelease = inputYearRelease;

    }

    public String getName() {
        return  Name;
    }

    public String getColor() {
        return Color;
    }

    public int getYearRelease() {
        return YearRelease;
    }
}
