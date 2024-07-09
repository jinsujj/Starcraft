package com.example.starcraft;

public class Protoss extends Race {
    public Protoss(){
        super("Protoss");
    }

    @Override
    public Unit createGroundUnit(String unitType) {
        return new GroundUnit(unitType, 120, 12, 8, 1.2, new AttackType(true, false, false));
    }

    @Override
    public Unit createAirUnit(String unitType) {
        return new AirUnit(unitType, 170, 18, 5, 1.7, new AttackType(false, true, false));
    }

    @Override
    public Building createBuilding(String buildingType) {
        return new Building(buildingType);
    }
    
}
