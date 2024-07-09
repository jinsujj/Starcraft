package com.example.starcraft.race;

import com.example.starcraft.unit.Unit;
import com.example.starcraft.unit.GroundUnit;
import com.example.starcraft.Building;
import com.example.starcraft.unit.AirUnit;
import com.example.starcraft.unit.AttackType;

public class Zerg extends Race{
    public Zerg(){
        super("Zerg");
    }

    @Override
    public Unit createGroundUnit(String unitType) {
        return new GroundUnit(unitType, 90, 8, 4, 0.8, new AttackType(true, false, false),100,100);
    }

    @Override
    public Unit createAirUnit(String unitType) {
        return new AirUnit(unitType, 130, 14, 2, 1.3, new AttackType(false, true, false),100,100);
    }

    @Override
    public Building createBuilding(String buildingType) {
        return new Building(buildingType);
    }
    
}
