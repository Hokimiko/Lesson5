package com.company;

public class Boss {
    int health;
    int damage;
    int defenceType;

    public Boss(int health, int damage, int defenceType) {
        this.health = health;
        this.damage = damage;
        this.defenceType = defenceType;
    }

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

    public int getDefenceType() {
        return defenceType;
    }

    public void setDefenceType(int defenceType) {
        this.defenceType = defenceType;
    }
    public void changeDefenceType(int defenceType) {
        this.defenceType = defenceType;
    }
}
