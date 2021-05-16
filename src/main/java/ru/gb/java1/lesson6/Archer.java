package ru.gb.java1.lesson6;

import ru.gb.java1.lesson6.model.Unit;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 13.05.2021
 */

public class Archer extends Unit {

    public Archer(String name, int health, int attack, int defence, int power) {
        super(name, health, attack, defence, power);
    }

    @Override
    public void jump(){
        System.out.println(this.name + " jump-jump-jump");
    }


}
