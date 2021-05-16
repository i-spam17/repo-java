package ru.gb.java1.lesson6;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 13.05.2021
 */

public class Titan extends Paladin {

    public Titan(String name, int health, int attack, int defence, int power, int level) {
        super(name, health, attack, defence, power, level);
    }

    public void superDamage(){
        System.out.println(this.name + " deal super attack at " + this.attack * this.power * 150);
    }

    @Override
    public void healSelf(int value) {
        System.out.println("I dont have idea - what is Heal-Self");
    }

    @Override
    public void speak(){
        super.speak(); // вызов родительского метода (любого)
        System.out.println("Hello from Override method from Titan");
    }

    @Override
    public void jump(){
        System.out.println("Titan not jump");
    }
}
