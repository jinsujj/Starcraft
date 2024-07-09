package com.example.starcraft.race;

import com.example.starcraft.Building;
import com.example.starcraft.unit.Unit;
import com.example.starcraft.unit.GroundUnit;
import com.example.starcraft.unit.ResourceUnit;
import com.example.starcraft.unit.AirUnit;
import com.example.starcraft.unit.AttackType;

public class Protoss extends Race {
    public Protoss(){
        super("Protoss");
    }

    @Override
    public Unit createGroundUnit(String unitType) {
        return new GroundUnit(unitType, 120, 12, 8, 1.2, new AttackType(true, false, false),100,100);
    }

    @Override
    public Unit createAirUnit(String unitType) {
        return new AirUnit(unitType, 170, 18, 5, 1.7, new AttackType(false, true, false),100, 100);
    }

    @Override
    public ResourceUnit createResourceUnit() {
        return new ResourceUnit("Probe", 60, 5, 0, 1.0, new AttackType(true, false, false), 50, 20, 8);
    }
    

    @Override
    public Building createBuilding(String buildingType) {
        return new Building(buildingType);
    }
    
}
