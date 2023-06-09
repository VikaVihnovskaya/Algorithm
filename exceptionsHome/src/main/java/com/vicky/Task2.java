package com.vicky;

//Если необходимо, исправьте данный код
//        try {
//            int d = 0;
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e);
//        }
public class Task2 {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching ArithmeticException: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Catching IndexOutOfBoundsException: " + e);
        }
    }

}
