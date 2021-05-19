package ru.gb.java1.lesson6.hw6;
/**
 * 1. Создать классы Собака и Кот с наследованием от класса Животное.
 * 2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
 * Результатом выполнения действия будет печать в консоль. (Например, dog.run(150); -> 'Бобик пробежал 150 м.');
 * 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
 * 4. * Добавить подсчет созданных котов, собак и животных.
 */

public class hw6 {
    public static void main(String[] args) {
        cat cat1 = new cat("кошка", "Барсик", 3, 0);
        cat cat2 = new cat("кошка", "Мурзик", 2, 0);
        dog dog = new dog("пёс", "Шарик",5,7);
        cat1.animalName();
        cat1.run(20);
        cat1.swim(40);

        cat2.animalName();
        cat2.run(130);
        cat2.swim(20);

        System.out.println("--------------");

        dog.animalName();
        dog.swim(15);

        System.out.println("--------------");

        System.out.println("количество кошек = " + Animals.quantityCat);
        System.out.println("количество собак = " + Animals.quantityDog);
        System.out.println("всего животных = " + (Animals.quantityCat + Animals.quantityDog));
    }
}
