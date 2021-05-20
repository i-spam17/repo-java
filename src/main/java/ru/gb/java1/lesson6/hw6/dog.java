package ru.gb.java1.lesson6.hw6;

  class dog extends Animals {

    dog (String type, String name, int speedRun, int speedSwim) {
        super(type, name, speedRun, speedSwim);
        quantityDog +=1;
    }

      @Override
      void run(int length) {
          if (length <=500) {
              super.run(length);
          } else {
              System.out.println(this.name + " дальше не побежит! максимум 500м");
          }
      }

      @Override
      void swim(int length) {
        if (length <= 10) {
            super.swim(length);
        } else {
            System.out.println(this.name + " дальше не поплывет! максимум 10м");
        }
      }
  }
