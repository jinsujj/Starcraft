package com.example.starcraft.unit;

public class ResourceUnit extends GroundUnit{

    private int resourceCollectionRate;

    public ResourceUnit(String unitType, int health, int attackDamage, int armor, double attackSpeed, AttackType attackType, int mineralCost, int buildTime, int resourceCollectionRate) {
        super(unitType, health, attackDamage, armor, attackSpeed, attackType, mineralCost, buildTime);
        this.resourceCollectionRate = resourceCollectionRate;
    }

    public int collectResources() {
        System.out.println(unitType + " is collecting resources.");
        return resourceCollectionRate;
    }
}
