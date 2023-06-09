package com.vicky;


import java.util.Scanner;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.
public class Task1 {

    public static void main(String[] args) {
        boolean isCorrectValuePassed = false;
        while (!isCorrectValuePassed) {
            try {
                double x = inputFloat();
                System.out.println("Введеное число = " + x);
                isCorrectValuePassed = true;
            } catch (Exception exception) {
                System.out.println("Некоторретное значение введено");
                isCorrectValuePassed = false;
            }
        }
    }

    private static double inputFloat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число через запятую: ");
        return scanner.nextDouble();
    }
}