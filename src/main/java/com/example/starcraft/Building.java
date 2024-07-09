package com.example.starcraft;

import com.example.starcraft.unit.AirUnit;
import com.example.starcraft.unit.GroundUnit;
import com.example.starcraft.unit.Unit;
import com.example.starcraft.unit.AttackType;

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
        // 생산 비용과 시간을 고려한 유닛 생성 로직
        if (isAirUnit) {
            return new AirUnit(unitType, 130, 14, 2, 1.3, new AttackType(false, true, false), 150, 60);
        } else {
            return new GroundUnit(unitType, 90, 8, 4, 0.8, new AttackType(true, false, false), 50, 25);
        }
    }
}
