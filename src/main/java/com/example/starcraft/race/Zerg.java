package com.example.starcraft;

public class Zerg extends Race{
    public Zerg(){
        super("Zerg");
    }

    @Override
    public Unit createGroundUnit(String unitType) {
        return new GroundUnit(unitType, 90, 8, 4, 0.8, new AttackType(true, false, false));
    }

    @Override
    public Unit createAirUnit(String unitType) {
        return new AirUnit(unitType, 130, 14, 2, 1.3, new AttackType(false, true, false));
    }

    @Override
    public Building createBuilding(String buildingType) {
        return new Building(buildingType);
    }
    
}
