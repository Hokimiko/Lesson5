package com.company;

public class MagicDoor {

    public Hero[] heroes() {

        Hero hero = new Hero(250, 25, 1);
        Hero hero1 = new Hero(250, 25, 2);
        Hero hero2 = new Hero(250, 25, 3);
        Hero hero3 = new Hero(250, 25, 4);

        Hero[] array = {hero, hero1, hero2, hero3};

        for (int i = 0; i < array.length; i++) {
            switch (array[i].getAbility()) {
                case 1:
                    System.out.println("Magic");
                    break;
                case 2:
                    System.out.println("Warrior");
                    break;
                case 3:
                    System.out.println("Mental");
                    break;
                case 4:
                    System.out.println("Thor");
                    break;
            }
        }
        return array;
    }

}
