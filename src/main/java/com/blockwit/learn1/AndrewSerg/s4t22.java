//Написать программу, которая спрашивает имена и года рождения 4 людей. После этого выводит имена и кол-во лет
package com.blockwit.learn1.AndrewSerg;

import java.util.Scanner;

public class s4t22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] Names = new String[4];
        for (int i = 0; i < Names.length; i++) {
            System.out.println("Напишите имя");
            Names[i] = in.nextLine();
        }
        int[] BirthDay = new int[4];
        for (int i = 0; i < BirthDay.length; i++) {
            System.out.println("Напишите год рождения");
            BirthDay[i] = in.nextInt();
        }
        int Age = 0;
        for (int i = 0; i < Names.length; i++) {
            Age = 2022 - BirthDay[i];
            System.out.println(Names[i] + " Кол-во лет " + Age);
            in.close();
        }
    }
}


