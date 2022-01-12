//Написать программу, которая спрашивает у пользователя четыре числа.
//А затем меняет местами первое и последнее число только если последнее больше первого. Затем выводит числа.
package com.blockwit.learn1.AndrewSerg;

import java.util.Scanner;

public class s4t6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] Numbers = new int[4];
        for (int i = 0; i < Numbers.length; i++) {
            System.out.println("Назовите числа");
            Numbers[i] = in.nextInt();
        }
        int temp = Numbers[0];
        Numbers[0] = Numbers[Numbers.length - 1];
        Numbers[Numbers.length - 1] = temp;
        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[Numbers.length-1]<Numbers[0])
                System.out.println(Numbers[i]);
                in.close();
            }
        }
    }
