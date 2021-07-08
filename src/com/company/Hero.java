package com.company;

public class Hero {
    int health;
    int damage;
    int ability;

    public Hero(int health, int damage, int ability) {
        this.health = health;
        this.damage = damage;
        this.ability = ability;

    }
    public Hero(){}

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getAbility() {
        return ability;
    }

    public void setAbility(int ability) {
        this.ability = ability;
    }
}

