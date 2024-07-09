package com.example.starcraft.race;

/*
 * 책임: 지형 정보를 관리
 * 메시지: isAccessibleByGround(), isAccessibleByAir()
 */
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
