package ru.gb.java1.lesson6.model;

import ru.gb.java1.lesson6.Lesson6;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 13.05.2021
 */

public abstract class Unit {

    protected String name;
    protected int health;
    protected int attack;
    protected int defence;
    protected int power;

    public Unit(String name) {
        this.name = name;
    }

    public Unit(String name, int health, int attack, int defence, int power) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defence = defence;
        this.power = power;
    }

    public void speak() {
        System.out.println("Hello. My name is " + name + ". My HP=" + health);
    }

    public void getDamage() {
        System.out.println(name + " has attack " + attack * power + " dmg");
    }

    public void healSelf(int value) {
        int tmp = value + defence;
        health += tmp;
        System.out.println(name + " heal-self at " + tmp + ". My HP now is " + health);
    }

    public abstract void jump();

}
