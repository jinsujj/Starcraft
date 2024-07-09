package com.example.starcraft.race;

public class Terrain {
    private String type;

    public Terrain(String type){
        this.type = type;
    }

    public boolean isAccessibleByGround() {
        return !type.equals("Water");
    }

    public boolean isAccessibleByAir() {
        return true;
    }

}
