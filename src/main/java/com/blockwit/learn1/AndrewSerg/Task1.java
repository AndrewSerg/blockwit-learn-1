package com.blockwit.learn1.AndrewSerg;

public class Task1 {
    public static void main(String[] args) {
        String[] names = {"Alisa", "Bob", "john", "Karl", "Alex"};
        String[] alfabit = {"a", "b", "c", "d"};
        int[] numbers = {12, 24, 29, 45, 55};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
            for (int j = 0; j < alfabit.length; j++) {
                System.out.println(alfabit[j]);
            }

            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] > 30) {
                    System.out.println(numbers[j]);
                }
            }
        }
    }
}

