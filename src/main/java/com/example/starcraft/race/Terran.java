package com.example.starcraft.race;

import com.example.starcraft.unit.Unit;
import com.example.starcraft.unit.GroundUnit;
import com.example.starcraft.unit.ResourceUnit;
import com.example.starcraft.Building;
import com.example.starcraft.Player;
import com.example.starcraft.unit.AirUnit;
import com.example.starcraft.unit.AttackType;

/*
 *  책임: 테란 종족의 특성 및 유닛/건물 관리.
 *  메시지: createGroundUnit(), createAirUnit(), createBuilding()
 */

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
    public ResourceUnit createResourceUnit(Player player) {
        return new ResourceUnit("Scv", 60, 5, 0, 1.0, new AttackType(true, false, false), 50, 20, 8,player);
    }

    @Override
    public Building createBuilding(String buildingType) {
        switch(buildingType) {
            case "CommandCenter": return new Building("CommandCenter", 500, 400, 150);
            case "Barracks": return new Building("Barracks", 350, 150, 65);
            case "SupplyDepot": return new Building("SupplyDepot", 200, 100, 30);
            default: throw new IllegalArgumentException("Unknown building type: " + buildingType);
        }
    }

    @Override
    public Unit createAirUnit(String unitType) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createAirUnit'");
    }

    
}
