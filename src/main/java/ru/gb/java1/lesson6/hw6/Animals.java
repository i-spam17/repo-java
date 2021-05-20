package ru.gb.java1.lesson6.hw6;

public abstract class Animals {
    static int quantityCat;
    static int quantityDog;
    String name;
    String type;
    protected int length;
    protected int speedRun;
    protected int speedSwim;

    public Animals(String type, String name, int speedRun, int speedSwim) {
        this.type = type;
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
    }

    void animalName () {
        System.out.println(
                "я -" + this.type +
                "\nмоя кличка -" + this.name +
                        "\nмоя скорость бега -" + this.speedRun +
                        "\nмоя скорость плавания -" + this.speedSwim );
    }

    void run (int length) {
    System.out.println(name + " пробежал " + length + "м");
    }

    void swim (int length) {
        System.out.println(name + " проплыл " + length + "м");
    }

}
