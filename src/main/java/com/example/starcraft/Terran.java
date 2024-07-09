package com.example.starcraft;

public class Terran extends Race {
    public Terran(){
        super("Terran");
    }

    @Override
    public Unit createGroundUnit(String unitType) {
        return new GroundUnit(unitType, 100, 10, 5, 1.0, new AttackType(true, false, false));
    }

    @Override
    public Unit createAirUnit(String unitType) {
        return new AirUnit(unitType, 150, 15, 3, 1.5, new AttackType(false, true, false));
    }

    @Override
    public Building createBuilding(String buildingType) {
        return new Building(buildingType);
    }
    
}
