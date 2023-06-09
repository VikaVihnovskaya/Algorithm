package com.vicky;

import java.util.Scanner;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class Task4 {
    public static void main(String[] args) {
     throwException();
    }

    public static void throwException(){
        String inputStr = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ведите строку: ");
        inputStr = scanner.nextLine();
        if (!inputStr.isEmpty()) {
            System.out.printf("Вы ввели: %s", inputStr);
            System.out.println();
        } else {
            System.out.println("Пустые строки вводить нельзя!");
            throw new RuntimeException("Вы ввели пустую строку");
        }
    }
}
