package com.example.starcraft.unit;


import com.example.starcraft.Player;
import com.example.starcraft.Building;

/*
 * 책임: 자원 채취 유닛의 특성 및 행동 정의
 * 메시지: attack(), collectResources(), buildBuilding()
 */

public class ResourceUnit extends GroundUnit{
    private int resourceCollectionRate;
    private Player player;

    public ResourceUnit(String unitType, int health, int attackDamage, int armor, double attackSpeed, AttackType attackType, int mineralCost, int buildTime, int resourceCollectionRate ,Player player) {
        super(unitType, health, attackDamage, armor, attackSpeed, attackType, mineralCost, buildTime);
        this.resourceCollectionRate = resourceCollectionRate;
        this.player = player;
    }

    public int collectResources() {
        System.out.println(unitType + " is collecting resources.");
        return resourceCollectionRate;
    }

    public void buildBuilding(Player player, String buildingType) {
        Building building = player.getRace().createBuilding(buildingType);
        if (player.spendResources(building.getMineralCost())) {
            System.out.println(unitType + " is building " + buildingType);
            player.addBuilding(building);
        } else {
            System.out.println("Not enough resources to build " + buildingType);
        }
    }
}
