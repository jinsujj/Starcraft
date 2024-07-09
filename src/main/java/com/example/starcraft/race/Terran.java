package com.example.starcraft.race;

import com.example.starcraft.unit.Unit;
import com.example.starcraft.unit.GroundUnit;
import com.example.starcraft.Building;
import com.example.starcraft.unit.AirUnit;
import com.example.starcraft.unit.AttackType;


public class Terran extends Race {
    public Terran(){
        super("Terran");
    }

    @Override
    public Unit createGroundUnit(String unitType) {
        switch(unitType) {
            case "Marine": return new GroundUnit("Marine", 100, 6, 0, 1.0, new AttackType(true, false, false), 50, 25);
            case "Firebat": return new GroundUnit("Firebat", 100, 8, 1, 1.5, new AttackType(true, false, false), 75, 30);
            case "Medic": return new GroundUnit("Medic", 100, 0, 1, 1.2, new AttackType(false, false, false), 50, 30);
            case "Tank": return new GroundUnit("Tank", 150, 15, 2, 2.5, new AttackType(true, false, false), 150, 50);
            case "Vulture": return new GroundUnit("Vulture", 120, 10, 1, 1.8, new AttackType(true, false, false), 75, 35);
            default: throw new IllegalArgumentException("Unknown unit type: " + unitType);
        }
    }

    @Override
    public Unit createAirUnit(String unitType) {
        switch(unitType) {
            case "Wraith": return new AirUnit("Wraith", 120, 20, 0, 2.0, new AttackType(false, true, false), 150, 60);
            case "Valkyrie": return new AirUnit("Valkyrie", 200, 25, 2, 3.0, new AttackType(false, true, false), 250, 90);
            case "Battlecruiser": return new AirUnit("Battlecruiser", 500, 40, 3, 5.0, new AttackType(true, true, true), 400, 120);
            default: throw new IllegalArgumentException("Unknown unit type: " + unitType);
        }
    }

    @Override
    public Building createBuilding(String buildingType) {
        return new Building(buildingType);
    }
    
}
