package com.example.starcraft.unit;

/*
 * 책임: 공중 유닛의 특성 및 행동 정의
 * 메시지: attack()
 */

public class AirUnit extends Unit{
    public AirUnit(String unitType, int health, int attackDamage, int armor, double attackSpeed, AttackType attackType) {
        super(unitType, health, attackDamage, armor, attackSpeed, attackType);
    }

    @Override
    public void attack(Unit target) {
        if(canAttack(target)){
            System.out.println(unitType +" is attacking "+ target.unitType + " with ranged attack");
            target.health -= attackDamage;
        }else{
            System.out.println(unitType+" cannot attack "+ target.unitType);
        }
    }

}
