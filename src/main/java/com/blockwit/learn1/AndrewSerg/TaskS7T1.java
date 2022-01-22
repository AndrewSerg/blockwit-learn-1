package com.blockwit.learn1.AndrewSerg;

public class TaskS7T1 {
    public static void main(String[] args) {
        Helper helper = new Helper();
        int[] number = {-9, 1, 5, 6, 8};
        int[] number1 = {7, 3, 1};
        System.out.println("Первый массив: ");
        helper.printIntArray(number);
        System.out.println("Второй массив: ");
        helper.printIntArray(number1);
        int[] c = new int[number.length + number1.length];
        int count = 0;
        for(int i=0;i<number.length;i++){
            c[i]=number[i];
            count++;
        }
        for (int j=0;j<number1.length;j++){
            c[count++]=number1[j];
        }
        System.out.println("Объединенный массив");
        helper.printIntArray(c);
    }
}
