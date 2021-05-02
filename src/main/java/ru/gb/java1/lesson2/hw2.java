package ru.gb.java1.lesson2;

public class hw2 {
    public static void main(String[] args) {
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

        checkSum();
        System.out.println("------------------");
        checkNumber();
        System.out.println("------------------");
        System.out.print( checkBool(2) );
        System.out.println("\n------------------");
        myString(3, "hi, Java! ");
        System.out.println("------------------");
        System.out.print("Этот год " + myYear(1000) );
        System.out.println("\n\nЗадание из методички");
        myWorkLesson1();
        System.out.println("------------------");
        myWorkLesson2();
        System.out.println("------------------");
        myWorkLesson3();
        System.out.println("------------------");
        myWorkLesson4();
        System.out.println("------------------");
        myWorkLesson5();
    }

    // 1. Написать метод, принимающий на вход два целых числа и проверяющий,
    //что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    //в противном случае – false.

    public static void checkSum() {
        int a = 2, b = 13, sum = a + b;
        if (sum >= 10 & sum <= 20) {
            System.out.println("true");
        } else System.out.println("faulse");;
        }


    //2. Написать метод, которому в качестве параметра передается целое число,
    //метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    //Замечание: ноль считаем положительным числом.

    public static void checkNumber() {
        int a = -3;
        if (a >= 0) {
            System.out.println("positive");
        } else System.out.println("negative");;
    }

    //3. Написать метод, которому в качестве параметра передается целое число.
    //Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    public static boolean checkBool(int a) {
        return (a >= 0);
    }

    //4. Написать метод, которому в качестве аргументов передается строка и число,
    //метод должен отпечатать в консоль указанную строку, указанное количество раз;

    public static void myString (int a, String b) {
        for ( int i = 0; i < a; i++ ) {
            System.out.print(b);
        }
        System.out.println();
    }

    //5.* Написать метод, который определяет, является ли год високосным,
    //и возвращает boolean (високосный - true, не високосный - false).
    //Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static boolean myYear (int a) {
        if ( (a % 4) == 0 && (a % 100) == 0 && ((a - 400) % 400) != 0 ) {
            return false;
        }   return true;
    }


    // Задания из методички
    public static void myWorkLesson1 () {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || i == 5 || j == 0 || j == 5) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
        }

    public static void myWorkLesson2 () {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || i == 5 || j == 0 || j == 5 || i==j) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void myWorkLesson3 () {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j < 1 || i == 5 || i==j) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void myWorkLesson4 () {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i<2 || j < 2 || i > 3 || j >3) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void myWorkLesson5 () {
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
