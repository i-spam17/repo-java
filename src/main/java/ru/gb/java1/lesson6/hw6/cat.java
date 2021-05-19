package ru.gb.java1.lesson6.hw6;

 class cat extends Animals {

    cat (String type, String name, int speedRun, int speedSwim) {
        super(type, name, speedRun, speedSwim);
        quantityCat +=1;
    }

     @Override
     void swim(int length) {
         System.out.println(this.name + " плавать не умеет!");
     }

     @Override
     void run(int length) {
        if (length <=200) {
            super.run(length);
        } else {
            System.out.println(this.name + " дальше не побежит! максимум 200м");
        }
        }
 }
