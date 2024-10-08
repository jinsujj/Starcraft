package com.example.starcraft.race;

import com.example.starcraft.Building;
import com.example.starcraft.Player;
import com.example.starcraft.unit.ResourceUnit;
import com.example.starcraft.unit.Unit;

/*
 *  책임: 종족의 특성 및 유닛/건물 관리.
 *  메시지: createGroundUnit(), createAirUnit(), createBuilding()
 */
public abstract class Race {
    private String name;

    public Race(String name){
        this.name = name;
    }

    public abstract Unit createGroundUnit(String unitType);
    
    public abstract Unit createAirUnit(String unitType);

    public abstract ResourceUnit createResourceUnit(Player player);

    public abstract Building createBuilding(String buildType);
    
}
