package ru.gb.java1.lesson5;

public class hw5Man {
    /**
     * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
     * 2. Конструктор класса должен заполнять эти поля при создании объекта.
     * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
     * 4. Создать массив из 5 сотрудников.
     * Пример:
     * Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
     * persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
     * 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
     */

    private String firstName;
    private String surname;
    private String patronymic;
    private String position;
    private String eMail;
    private String phoneNumber;
    private int salary;
    private int age;

    public hw5Man(String surname, String firstName, String patronymic, String position, String eMail, String phoneNumber, int salary, int age) {
        this.firstName = firstName;
        this.surname = surname;
        this.patronymic = patronymic;
        this.position = position;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
        workMan();
    }

    void workMan() {
        System.out.println("My full name is " + this.surname + " " + this.firstName + " " + this.patronymic + ". My position is " + this.position );
        System.out.println("my phoneNumber is " + this.phoneNumber + ", my salary is " + this.salary + ", my age is " + this.age);
    }

    public int getAge() {
        return age;
    }


}





