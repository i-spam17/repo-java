package ru.gb.java1.lesson1;

public class HomeWorkApp {
    //1. Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main()
    public static void main(String[] args) {
        System.out.println("2. Три слова в столбец:");
        printThreeWords();
        System.out.println("----------------------\n3. Сумма чисел положительное/Отрицательное");
        checkSumSign();
        System.out.println("----------------------\n4. Красный/желтый/зеленый");
        printColor();
        System.out.println("----------------------\n5. Сравнение чисел");
        compareNumbers();
    }


    //2. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова:
    // Orange, Banana, Apple.

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    //3.Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их
    // любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные,
    // и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”,
    // в противном случае - “Сумма отрицательная”

    public static void checkSumSign() {
        int a = 3, b = -5;

        if (a + b >= 0) {
            System.out.println("a=" +a + ", b=" + b + ", a+b=" + (a + b) + "\nСумма положительная");
        }
        else {
            System.out.println("a=" +a + ", b=" + b + ", a+b=" + (a + b) + "\nСумма отрицательная");
        }
    }

    //4. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
    // Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в
    // пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) -
    // “Зеленый”;

    public static void printColor() {
    int value = 105;
    if (value <= 0) {
        System.out.println("value=" + value + "\nКрасный");
    } else if (value > 100) {
        System.out.println("value=" + value + "\nЗеленый");
        } else {
        System.out.println("value=" + value + "\nЖелтый");
    }
    }

    // 5. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их
    // любыми значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль
    // сообщение “a >= b”, в противном случае “a < b”;

    public static void compareNumbers() {
        int a = 3, b = 4;
        if (a >= b) {
            System.out.println("a = " + a + ", b = " + b + "\na >= b");
        } else {
            System.out.println("a = " + a + ", b = " + b + "\na < b");
        }
    }
}
