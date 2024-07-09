package com.example.starcraft;

/*
 * 책임: 건물의 특성 및 행동 정의 
 * 메시지: produceUnit()
 */
public class Building {
    private String buildingType;
    private int health;

    public Building(String buildType){
        this.buildingType = buildType;
        this.health = 500;
    }

    public Unit produceUnit(String unitType, boolean isAirUnit) {
        if (isAirUnit) {
            return new AirUnit(unitType, 130, 14, 2, 1.3, new AttackType(false, true, false));
        } else {
            return new GroundUnit(unitType, 90, 8, 4, 0.8, new AttackType(true, false, false));
        }
    }
}
