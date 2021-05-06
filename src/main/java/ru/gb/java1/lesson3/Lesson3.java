package ru.gb.java1.lesson3;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 03.05.2021
 */

public class Lesson3 {

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();//[0;1)

    public static int[][] myIntArray2;

    public static void main(String[] args) {
//        int height = random.nextInt(20);
//        int width = random.nextInt(20);

//        myTableFill(height, width);
//        readTwoArray(myIntArray2);
//        int[] myInt = new int[2000000000];

        String[] myTestStringArray = {"Barsik", "Murzik" ,"Cat1", "Cat2", "Cat3"}; // new String[5] //явное определение массива
        //myTestStringArray[0] = "Barsik"
        System.out.println(myTestStringArray[0]);

//        int[][][] testArray3 =new int[14][23][15];
//
//        for (int i = 0; i < testArray3.length; i++) {
//            for (int j = 0; j < testArray3[i].length; j++) {
//                for (int k = 0; k < testArray3[i][j].length; k++) {
//
//                }
//            }
//        }

//        welcomeUser("User1", "Qwerty", "Qwerty2", 45);
//        System.out.println(myMath(10, 15));
//        System.out.println(myMath(11.5f, 15.96f));


//        System.out.println("Random Float = " + random.nextFloat());//[0;1)
//        System.out.println("Random Int = " + random.nextInt()); //[-int;+int]
//        System.out.println("Random Int 0-15 = " + random.nextInt(15)); //[0;15]
//
//        char myChar = (char) random.nextInt(128);
//        System.out.println("Random char: " + myChar);
//
//        int min = -40;
//        int max = 10;
//        int diff = max - min;
//        int value = random.nextInt(diff + 1);
//        value += min;
//        System.out.println("value = " + value);


//        System.out.println("Hello Java");
//        System.out.print("Enter your text: ");
//        printUserData();
//
//        int userInt = scanner.nextInt();
//        System.out.println("Result: " + (userInt * 10));
//        System.out.print("Enter your string: ");
//        String userDataForMethod = scanner.next();
//        System.out.println();
//        System.out.print("Enter you value: ");
//        int count = scanner.nextInt();
//        scannerPlusRandom(userDataForMethod, count);

//        String[] myStringArray = new String[4];
//        myStringArray[0] = "My First String in Array";
//        myStringArray[1] = "My Second String in Array";
//        myStringArray[2] = "My Third String in Array";
//        myStringArray[3] = "My Fourth String in Array";
//
//        System.out.println("In my array " + myStringArray[2]);
//
//        myStringArray[2] = "Hello world";
//
//        System.out.println("In my array " + myStringArray[2]);
//        String[] box = new String[10];
//        String[] catArray = new String[50];
//        box[0] = "cat1";
//        box[1] = "cat2";
//        box[2] = "cat3";

//        for (int i = 0; i < box.length; i++) {
//            box[i] = "cat" + (i + 1);
//        }
//
//        for (int i = 0; i < box.length; i++) {
//            System.out.print(box[i] + " | ");
//        }

//        fillArray(catArray, "Barsik");
//        readArray(catArray);
//
//        fillArray(box, "cat");
//        readArray(box);

    }

    public static void myTableFill(int height, int width) {
        myIntArray2 = new int[height][width];
        int count = 0;
        for (int y = 0; y < myIntArray2.length; y++) {
            for (int x = 0; x < myIntArray2[y].length; x++) {
                myIntArray2[y][x] = count;
                count++;
            }
        }
    }

    public static void readTwoArray(int[][] inputArray) {
        for (int y = 0; y < inputArray.length; y++) {
            for (int x = 0; x < inputArray[y].length; x++) {
                System.out.print(inputArray[y][x] + "\t");
            }
            System.out.println();
        }
    }

//    public static void fillArray(String[] inputArray, String inputString) {
//        for (int i = 0; i < inputArray.length; i++) {
//            inputArray[i] = inputString + (i + 1);
//        }
//    }
//
//    public static void readArray(String[] inputArray) {
//        for (int i = 0; i < inputArray.length; i++) {
//            System.out.print(inputArray[i] + " | ");
//        }
//        System.out.println();
//    }

//    public static void welcomeUser(String username) {
//        System.out.println("Hello user " + username);
//    }
//
//    public static void welcomeUser(String userName, String userSurname) {
//        System.out.println("Hello user " + userName + " " + userSurname);
//    }
//
//    public static void welcomeUser(String userName, String lastName, String userSurname) {
//        System.out.println("Hello user " + userName + " " + lastName + " " + userSurname);
//    }
//
//    public static void welcomeUser(String userName, String lastName, String userSurname, int age) {
//        System.out.println("Hello user " + userName + " " + lastName + " " + userSurname);
//    }
//
//    public static int myMath(int x, int y) {
//        return x * y;
//    }
//
//    public static float myMath(float x, float y) {
//        return x + y;
//    }

//    public static void printUserData() {
//        System.out.println("Your message is " + scanner.next());
//    }


//    public static void scannerPlusRandom(String inputString, int numberWords) {
//        for (int i = 0; i < numberWords; i++) {
//            System.out.println(inputString + generateInt(-50, 60));
//        }
//    }
//
//    public static int generateInt(int min, int max) {
//        return random.nextInt(max - min + 1) + min;
//    }
}

/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 * С помощью цикла и условия заменить 0 на 1, 1 на 0;
 * 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
 * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
 * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 * 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
 * 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
 * 7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
 * метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
 * **Примеры:
 * checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
 * checkBalance([1, 1, 1, ||| 2, 1]) → false, т.е. 1 + 1 + 1 = 2 + 1
 * граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
 * 8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
 * при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
 * Для усложнения задачи нельзя пользоваться вспомогательными массивами.
 * Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
 * [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
 * При каком n в какую сторону сдвиг можете выбирать сами.
 */
