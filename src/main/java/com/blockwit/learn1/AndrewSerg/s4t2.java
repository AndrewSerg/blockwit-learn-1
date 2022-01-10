//Написать программу, которая спрашивает у пользователя 5 имен. А затем выводит все эти имена.
package com.blockwit.learn1.AndrewSerg;

import javax.lang.model.element.Name;
import java.util.Optional;
import java.util.Scanner;

public class s4t2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] Name=new String[5];
        for (int i = 0; i <Name.length; i++) {
            System.out.println("Напишите имя");
            Name[i] = in.nextLine();
        }
        for (int i = 0; i < Name.length; i++) {
            System.out.println(Name[i]);
        }
        in.close();
    }
}
