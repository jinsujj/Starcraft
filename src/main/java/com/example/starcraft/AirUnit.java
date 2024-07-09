package com.example.starcraft;

/*
 * 책임: 공중 유닛의 특성 및 행동 정의
 * 메시지: attack()
 */

public class AirUnit extends Unit{
    public AirUnit(String unitType){
        super(unitType, 80);
    }

    @Override
    public void attack(Unit target) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attack'");
    }

}
