package com.example.starcraft.unit;


/*
 *  책임: 유닛의 기본 속성 및 행동 정의
 *  행동: 공격 수행
 *  메시지: attack();
 */
public abstract class Unit {
    protected String unitType;
    protected int health;
    protected int attackDamage;
    protected int armor;
    protected double attackSpeed;
    protected AttackType AttackType;

    public Unit(String unitType, int health, int attackDamage,int armor, double attackSpeed, AttackType attackType){
        this.unitType = unitType;
        this.health = health;
        this.attackDamage = attackDamage;
        this.armor = armor;
        this.attackSpeed = attackSpeed;
        this.AttackType = attackType;
    }

    public abstract void attack(Unit target);

    public boolean canAttack(Unit target){
        return this.AttackType.canAttack(target);
    }
}
