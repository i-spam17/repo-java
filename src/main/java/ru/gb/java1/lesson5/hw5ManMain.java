package ru.gb.java1.lesson5;

public class hw5ManMain {

    public static void main(String[] args) {
//            hw5Man hw5Man1 = new hw5Man("Ivanov", "Ivan", "Ivanovich","manager","ivanov@mail.ru","8-123-1234567",1000,27);
//            hw5Man1.workMan();

        hw5Man[] persArray = new hw5Man[5];
        persArray[0] = new hw5Man("Ivanov", "Ivan", "Ivanovich", "manager", "ivanov@mail.ru", "8-123-1234567", 1000, 27);
        persArray[1] = new hw5Man("Petrov", "Ivan", "Ivanovich", "engineer", "petrov@mail.ru", "8-123-1111111", 2300, 32);
        persArray[2] = new hw5Man("Sidorov", "Ivan", "Ivanovich", "middle", "sidorov@mail.ru", "8-123-2222222", 3300, 37);
        persArray[3] = new hw5Man("Smith", "John", "_", "senjor", "j_smith@mail.ru", "8-123-3333333", 5000, 21);
        persArray[4] = new hw5Man("Mask", "Ilon", "_", "super manager", "i_mask@mail.ru", "8-123-4444444", 999999999, 45);

        System.out.println("--------------------");

        for (int i = 0; i < persArray.length; i++) {
            if ( persArray[i].getAge() > 40)
               persArray[i].workMan();
        }
    }
}
