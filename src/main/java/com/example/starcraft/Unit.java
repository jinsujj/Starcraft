package com.example.starcraft;

/*
 * 유닛의 기본 클래스.
 */
public abstract class Unit {
    protected String unitType;
    protected int health;

    public Unit(String unitType, int health){
        this.unitType = unitType;
        this.health = health;
    }

    public abstract void attack(Unit target);
}
