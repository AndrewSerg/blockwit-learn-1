//Написать программу, которая спрашивает у пользователя его год рождения и имя. Затем вычисляет сколько ему лет и выводит в формате: "<имя>, вам <кол-во_лет> лет"
package com.blockwit.learn1.AndrewSerg;

import java.util.Scanner;

public class s4t1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Name;
        System.out.println("Введите имя");
        Name = in.nextLine();
        int Birthday;
        System.out.println("Введите год рождения");
        Birthday = in.nextInt();
        int Age = 2022 - Birthday;
        System.out.println(Name + ", вам " + Age);
        in.close();
    }
}
