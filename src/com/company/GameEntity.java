package com.company;

public class GameEntity {
    private int health;
    private  int Damage;

    public GameEntity(int health, int damage) {
        this.health = health;
        Damage = damage;

    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;


}}
