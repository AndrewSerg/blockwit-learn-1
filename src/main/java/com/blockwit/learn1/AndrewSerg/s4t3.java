//Написать программу, которая спрашивает температуру за последние три дня, вычисляет среднюю температуру и выводит ее.
package com.blockwit.learn1.AndrewSerg;

import java.util.Scanner;

public class s4t3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] Temp = new int[3];
        for (int i = 0; i < Temp.length; i++) {
            System.out.println("Назовите температуру за три дня");
            Temp[i] = in.nextInt();
        }
        int SumTemp=0;
        for (int i = 0; i < Temp.length; i++) {
        SumTemp = Temp[i] + SumTemp;
        }
        System.out.println(SumTemp / 3);
        in.close();
    }
}

