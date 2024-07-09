package com.example.starcraft;

/*
 *  책임: 종족의 특성 및 유닛/건물 관리.
 *  메시지: createGroundUnit(), createAirUnit(), createBuilding()
 */
public class Race {
    private String name;

    public Race(String name){
        this.name = name;
    }

    public Unit createGroundUnit(String unitType){
        return new GroundUnit(unitType);
    }

    public Unit createAirUnit(String unitType){
        return new AirUnit(unitType);
    }
    public Building createBuilding(String buildType){
        return new Building(buildType);
    }
}
