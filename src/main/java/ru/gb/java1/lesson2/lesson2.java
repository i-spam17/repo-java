package ru.gb.java1.lesson2;

public class lesson2 {

    public static int valueFromClass = 987;

    public static void main (String[] args) {

/*
        //result = A * B + (C /D); a = int
        // A = a + b / c - d
        // B = b * c + a * d
        // C = a + b + c+ d
        //D = a - b - c - d
 */

//        int valueFromMethodMain = 874;
//        int a = 20;
//        int b = 20;
//        int result;
//
//        if (a > b) {
//            result = a;
//        } else {
//            result = b;
//        }
//
//        result = (a > b) ? doSomething1() : doSomething2(); //тернарный оператор
//
//        System.out.println("Result = " + result);

//        String nameLetter = "Qwerty";

//        {
//            int abc = 9999;
//            int cde = 1;
//            int result = abc + cde;
//        }


//        if (nameLetter == "Boris") {
//            System.out.println("Give letter to Boris");
//
//        } else if (nameLetter == "Olga") {
//            System.out.println("Give letter to Olga");
//        } else if (nameLetter == "Maria") {
//            System.out.println("Give letter to Maria");
//        } else {
//            System.out.println("Go out office");
//        }
//
//        System.out.println("*******************");
//
//        switch (nameLetter) {
//            case "Boris": // if (nameLetter == "Boris")
//                System.out.println("Give letter to Boris");
//                                break;
//            case "Maria":
//                System.out.println("Give letter to Maria");
//                break;
//            case "Olga":
//                System.out.println("Give letter to Olga");
//                break;
//            default:
//                System.out.println("Go out office");
//                break;
//        }
//        String value = "String";

//        int value1;
//        int value2;

//        for(value1 = 0, value2 = 15; value1 < 10; value1++, value2--) {
//            System.out.print(value + value1 + " > " + value2 + " | ");
//        }

//        for (int i = 0; i < 10; i++) {
//            System.out.print(value + i + " | ");
//        }

//        System.out.println(myMath(2, 10)); //1024
//
//        myPifagorTable(10,5);

//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 5; j++) {
//
//            }
//        }

//        int a = 0;
//
//        while (a < 10) { //смотрю на условие
//            a++;
//            if (a == 5 || a == 7) { //&&, ||, !
//                continue;
//            }
//            System.out.print(a + " | ");
//        }

//        int b = 0;
//        while(true) {
//            b++;
//            System.out.print(b + " | ");
//        }

//        int c = 0;
//        do {
//            c++;
//            if (c == 6) {
//                break;
//            }
//            System.out.print(c + " | ");
//        } while (c < 10);
//        int result = valueA(valueA(valueA(50,100,150,200),valueB(1,2,3,4),valueC(9,8,7,6),valueD(11,22,33,44)), valueB(10,20,30,40), valueC(-10,-20,-30,-40), valueD(1,2,3,4))
//                * valueB(10, 12, 14, 16)
//                + valueC(20, 25, 30, 35)
//                / valueD(0, 1, 2, 3);
//        System.out.println(result);
//
//    }
//
//    public static int valueA(int a, int b, int c, int d) {
//        return a + b / c - d;
//    }
//
//    public static int valueB(int a, int b, int c, int d) {
//        return b * c + a * d;
//    }
//
//    public static int valueC(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }
//
//    public static int valueD(int a, int b, int c, int d) {
//        return a - b - c - d;
//    }


//    public static int myMath(int baseValue, int signature) {
//        int result = 1;
//
//        for (int i = 0; i < signature; i++) {
//            result = result * baseValue;
//        }
//
//        return result;
//    }
//
//    public static void myPifagorTable(int width, int height) {
//        for (int y = 1; y <= height; y++) {
//            for (int x = 1; x <= width; x++) {
//                System.out.print(y * x + "\t");
//            }
//            System.out.println();
//        }
//    }

//    public static int doSomething1() {
//        int valueFromMethod1 = 100;
//        int abc;
//        abc = valueFromMethod1 + 100 / 200 + 1000;
//        return abc;
//    }
//
//    public static int doSomething2() {
//        System.out.println(valueFromMethodMain);
//        return 66;
//    }

//        for (int i = 3, j = 10; i < j; i++, j--) {
//            System.out.println("i-j:" + i + "-" + j);
//        }


//        int a = 1, b = 2, c = 0;
//        if (a < b) {
//            c = a * b;
//            System.out.println("a * b = " + c);
//        } else {
//            a = 0;
//            System.out.println("a = " + a);
//        }

//        for (int i = 0; i < 3; i++) {
//            int у = -1; // переменная у пересоздается на каждом такте цикла
//            System.out.println("у = " + у); // поэтому всегда выводится значение -1
//            у++;
//            System.out.println("у = " + у); // а тут y = 0
//        }
//        System.out.println();


        for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if (i == 0 || i == 5 || j == 0 || j == 5) {
                        System.out.print("* ");
                    } else
                        System.out.print("  ");
                }
                System.out.println();
            }

            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if (i == 0 || i == 5 || j == 0 || j == 5 || i==j) {
                        System.out.print("* ");
                    } else
                        System.out.print("  ");
                }
                System.out.println();
            }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j < 1 || i == 5 || i==j) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i<2 || j < 2 || i > 3 || j >3) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("-------------");

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i < 2 & j > 3 || i > 3 & j < 2 ) {
                    System.out.print("  ");
                } else
                    System.out.print("* ");
            }
            System.out.println();
        }








    }
}

/**
 * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
 * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
 * в противном случае – false.
 * 2. Написать метод, которому в качестве параметра передается целое число,
 * метод должен напечатать в консоль, положительное ли число передали или отрицательное.
 * Замечание: ноль считаем положительным числом.
 * 3. Написать метод, которому в качестве параметра передается целое число.
 * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
 * 4. Написать метод, которому в качестве аргументов передается строка и число,
 * метод должен отпечатать в консоль указанную строку, указанное количество раз;
 * 5.* Написать метод, который определяет, является ли год високосным,
 * и возвращает boolean (високосный - true, не високосный - false).
 * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */


