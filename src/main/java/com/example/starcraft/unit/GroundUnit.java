package com.example.starcraft;

/*
 * 책임: 지상 유닛의 특성 및 행동 정의
 * 메시지: attack()
 */

public class GroundUnit extends Unit {
    public GroundUnit(String unitType, int health, int attackDamage, int armor, double attackSpeed, AttackType attackType) {
        super(unitType, health, attackDamage, armor, attackSpeed, attackType);
    }

    @Override
    public void attack(Unit target) {
        if (canAttack(target)){
            System.out.println(unitType + " is attacking + " + target.unitType);
            target.health -= this.attackDamage;
        } else{
            System.out.println(unitType +" cannot attack "+ target.unitType);
        }
    }

}