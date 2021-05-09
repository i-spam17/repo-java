package ru.gb.java1.lesson3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class hw3 {

    public static int[] intArr5;
    public static Random randomLen = new Random();
    public static Random randomInitialValue = new Random();
    public static Random randomValueArray = new Random();


    public static void main(String[] args) {



        //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        changeNumber();
        System.out.println("---------------------");


        //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        myArr2();
        System.out.println("---------------------");


        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        myArrMultiply();
        System.out.println("---------------------");


        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        //и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
        //Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        myTableArr();
        System.out.println("---------------------");


        //5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int
        // длиной len, каждая ячейка которого равна initialValue;
        int initialValue = 0 - randomInitialValue.nextInt(5);
        int len = randomLen.nextInt(20) +1;
        myArr5(len, initialValue);
        System.out.println("---------------------");


        //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
        numberMinMax(intArr5);
        System.out.println("---------------------");


        //7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        //метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        //**Примеры:
        //checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
        //checkBalance([1, 1, 1, ||| 2, 1]) → false, т.е. 1 + 1 + 1 = 2 + 1
        //граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
        System.out.println(sumNumber(intArr5));
        System.out.println("---------------------");


//        8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
//         * при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
//                * Для усложнения задачи нельзя пользоваться вспомогательными массивами.
//         * Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
//         * [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
//         * При каком n в какую сторону сдвиг можете выбирать сами.
        moveArray(intArr5,2);

    }

    public static void changeNumber() {
        int[] intArr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("1. массив, состоящий из элементов 0 и 1:" + Arrays.toString(intArr1));
        for (int i = 0; i < intArr1.length; i++) {
            intArr1[i] = (1 - intArr1[i]);
        }
        System.out.println("Замена 0 на 1 и 1 на 0: " + Arrays.toString(intArr1));
    }

    public static void myArr2() {
        int[] intArr2 = new int[100];
        for (int i = 0; i < intArr2.length; i++) {
            intArr2[i] = i + 1;
        }
        System.out.println("2. массив от 1 до 100: " + Arrays.toString(intArr2));
    }

    public static void myArrMultiply() {
        int[] intArr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("3. Array 3: " + Arrays.toString(intArr3));
        for (int i = 0; i < intArr3.length; i++) {
            if (intArr3[i] < 6) {
                intArr3[i] = intArr3[i] * 2;
            }
        }
        System.out.println("числа меньше 6 умножить на 2: " + Arrays.toString(intArr3));
    }

    public static void myTableArr() {
        System.out.println("4. Диагонали в квадратном массиве ");
        int[][] intArr4 = new int[8][8];
        for (int i = 0; i < intArr4.length; i++) {
            for (int j = 0; j < intArr4[i].length; j++) {
                intArr4[i][j] = 0;
                if (intArr4[i] == intArr4[j] || (j + i + 1) == intArr4.length) {
                    intArr4[i][j] = 1;
                }
                System.out.print(intArr4[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void myArr5(int len, int initialValue) {
        intArr5 = new int[len];
        for (int i = 0; i < intArr5.length; i++) {
            intArr5[i] = initialValue + randomValueArray.nextInt(100);
        }
        System.out.println("5. массив по заданным значениям: " + Arrays.toString(intArr5));
    }

    public static void numberMinMax(int[] intArr5) {
        int min, max;
        min = max = intArr5[0];

        for (int i = 0; i < intArr5.length; i++) {
            if (intArr5[i] > max) {
                max = intArr5[i];
            }
            if (intArr5[i] < min) {
                min = intArr5[i];
            }
        }
        System.out.println("6. min value: " + min + "\tmax value: " + max);
    }

    public static boolean sumNumber(int[] intArr5) {
        int sum1 = 0;
        int sum2 = 0;
        for (int j = 0 ; j < (intArr5.length - 1) ; j++) {
            sum1 += intArr5[j];
            for (int i = j + 1; i < intArr5.length ; i++)
                sum2 += intArr5[i];
                if (sum1 == sum2) return true;
        }
        return false;

//        System.out.println("7. true \t sum1: " + sum1 + "sum2: " + sum2);



//        do {
//            for (int i = 0; i < intArr5.length; i++) {
//                sum1 += intArr5[i];
//            }
//            for (int j = intArr5.length - 1; j == 0; j--) {
//                sum2 += intArr5[j];
//            }
//
//            if (sum1 == sum2) {
//                System.out.println("7. true \t sum1: " + sum1 + "\t sum2: " + sum2);
//                break;
//            } else {
//                System.out.println("7. false \t sum1: " + sum1 + "\t sum2: " + sum2);
//                break;
//            }
//        } while (sum2 == 0);
    }


    public static void moveArray (int[] intArr5, int n) {
        int [] newMoveArr = new int[intArr5.length];
        if (n>0) {
            for (int i = 0; i < intArr5.length; i++) {
                if ((i + n) < intArr5.length) {
                    newMoveArr[i] = intArr5[i + n];
                } else {
                    newMoveArr[i] = intArr5[i - intArr5.length + n];
                }
            }
        } else if (n < 0) {
            for (int i = 0; i < intArr5.length; i++) {
                if ( n + i < 0 && n < 0) {
                     newMoveArr[i] = intArr5[intArr5.length + n + i ];
                } else {
                    newMoveArr[i] = intArr5[ n + i ];
                 }
            }
        }
        System.out.println("8. my new array is: " + Arrays.toString(newMoveArr));
    }


}





