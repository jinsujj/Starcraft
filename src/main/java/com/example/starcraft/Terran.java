package com.example.starcraft;

import com.example.starcraft.race.Race;
import com.example.starcraft.unit.Unit;
import com.example.starcraft.unit.GroundUnit;
import com.example.starcraft.unit.AirUnit;
import com.example.starcraft.unit.AttackType;

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
