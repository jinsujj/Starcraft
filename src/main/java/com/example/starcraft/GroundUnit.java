package com.example.starcraft;

/*
 * 책임: 지상 유닛의 특성 및 행동 정의
 * 메시지: attack()
 */

public class GroundUnit extends Unit{
    public GroundUnit(String unitType){
        super(unitType, 100);
    }

    @Override
    public void attack(Unit target) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attack'");
    }

}
