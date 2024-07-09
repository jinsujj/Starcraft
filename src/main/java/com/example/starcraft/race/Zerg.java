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
    public ResourceUnit createResourceUnit(Player player) {
        return new ResourceUnit("Drone", 60, 5, 0, 1.0, new AttackType(true, false, false), 50, 20, 8, player);
    }
    
    @Override
    public Building createBuilding(String buildingType) {
        return new Building(buildingType, 300, 100, 50);
    }
    
}
