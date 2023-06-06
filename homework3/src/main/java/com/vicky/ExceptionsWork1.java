package com.vicky;


public class ExceptionsWork1 {
    // 1.Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
//    public static void main(String[] args) {
//        int a = 0;
//        int b = 10 / a;
//}
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at com.vicky.ExceptionsWork1.main(ExceptionsWork1.java:7)

//        public static void main(String []args) {
//            int array [] = {1, 2, 3};
//            System.out.println(array[4]);
//}
//  Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
//	at com.vicky.ExceptionsWork1.main(ExceptionsWork1.java:13)
//         public static void main(String [] args) {
//          File f = new File("D://java/file.txt");
//           FileReader fileReader = new FileReader(f);
// }
//error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//      FileReader = new FileReader(f)


    //2.Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
//        public static int sum2d(String[][] arr) {
//            int sum = 0;
//            for (int i = 0; i < arr.length; i++) {
//                for (int j = 0; j < 5; j++) {
//                    int val = Integer.parseInt(arr[i][j]);
//                    sum += val;
//                }
//            }
//            return sum;
//        }
// Исключения: NumberFormatException при не integer данных или больше int
// ArrayIndexOutOfBoundsException при количестве элементов в массиве < 6
// NullPointerException при значениях массива null

    //3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    // и возвращает новый массив, каждый элемент которого равен разности элементов
    // двух входящих массивов в той же ячейке. Если длины массивов не равны,
    // необходимо как-то оповестить пользователя.

    public static int[] difference( int[] a, int[] b) {
        int[] difference_list = new int[a.length];
        if (a.length != b.length) {
            throw new RuntimeException("Array lengths are not equal");
        } else {
            for (int i = 0; i < a.length; i++) {
                difference_list[i] = a[i] - b[i];
            }
            return difference_list;
        }
    }
    public static void main(String[] args) {
        int[] a = new int []{1, 2, 3};
        int[] b = new int []{1, 2};
        difference(a, b);

        //Exception in thread "main" java.lang.RuntimeException: Array lengths are not equal
    }
}

