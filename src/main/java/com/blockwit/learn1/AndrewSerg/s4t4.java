//Написать программу, которая спрашивает, сколько у Вас друзей.
//А потом спрашивает имена этих друзей. Затем выводит имена друзей в обратном п
package com.blockwit.learn1.AndrewSerg;

import javax.lang.model.element.Name;
import java.util.Scanner;

public class s4t4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            System.out.println("Сколько у вас друзей");
            int frends =in.nextInt();
        in.nextLine();
        String[]Name=new String[frends];
                    for(int i = 0;i<frends;i++) {
                        System.out.println("Напишите имена друзей");
                        Name[i] = in.nextLine();
                    }
                        for (int i = frends-1; i >= 0; i--) {
                            System.out.println(Name[i]);
                        }
        in.close();
        }
    }

