package com.blockwit.learn1.AndrewSerg;

public class Tu1 {
    public static void main(String[] args) {
        int[] number = {12, 7, 89, -4, 8, 9};
        Helper helper=new Helper();
        helper.printIntArray(number);
        int temp = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] > number[j]) {
                    temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
            System.out.println(number[i]);
        }
    }
}

