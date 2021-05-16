package ru.gb.java1.lesson6;

import ru.gb.java1.lesson6.model.Unit;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 13.05.2021
 */

public class Lesson6 {

    public static void main(String[] args) {

        Paladin paladin = new Paladin("Paladin", 100, 25, 15, 50);
        Archer archer = new Archer("Archer", 75, 50, 2, 75);
        Mage mage = new Mage("Mage", 25, 100, 0, 100);

//
//        Paladin paladinTest = new Paladin("paladinTest", 150, 35, 20, 75, 15);
//        Titan titan = new Titan("Titan", 1500, 200, 100, 100, 99);
//
//        Unit[] army = {paladin, archer, mage, titan};
//
//        paladin.speak();
//        titan.speak();
//
//        for (int i = 0; i < army.length; i++) {
//            army[i].speak();
//            army[i].getDamage();
//            army[i].jump();
//
//            if (army[i] instanceof Paladin) {
//                Paladin tmpPaladin = (Paladin) army[i];
//                tmpPaladin.defenceSelf();
////                army[i].defenceSelf();
//            }
//            //если текущий элемент массива ПРИНАДЛЕЖИТ классу Paladin, то
//            //я создаю ссылку, в которой будет храниться 100% Paladin (приведение к типу Паладин)
//            //вызываю по ссылке у объекта его личный метод
//
//            if (army[i] instanceof Titan) {
//                ((Titan) army[i]).superDamage();
//            }
//        }


//        System.out.println("Paladin lvl = " + paladin.getLevel());
//        System.out.println("PaladinTest lvl = " + paladinTest.getLevel());

//        titan.speak();
//        titan.getDamage();
//        titan.healSelf(150);
//        titan.defenceSelf();
//        titan.superDamage();
//        titan.jump();

//        paladin.speak();
//        System.out.println("My inner-name is " + paladin.getInnerName());
//        paladin.getDamage();
//        paladin.healSelf(15);
//        paladin.defenceSelf();
//
//        archer.speak();
//        archer.getDamage();
//        archer.healSelf(30);
//
//        mage.speak();
//        mage.getDamage();
//        mage.healSelf(100);

//        byte b1 = 40;
//        int i1 = b1;
//        System.out.println(i1);
//
//        int i2 = 2049;
//        byte b2 = (byte) i2; //type casting (приведение типов)
//        System.out.println(b2);

        int myInt = 50;
        String myString = "Hello";
        Object[] myArrayObjects = new Object[3];
        myArrayObjects[0] = myInt;
        myArrayObjects[1] = myString;
        myArrayObjects[2] = paladin;

        for (int i = 0; i < myArrayObjects.length; i++) {
            if (myArrayObjects[i] instanceof String) {
                System.out.println(((String)myArrayObjects[i]).length());
            }
        }


    }
}
