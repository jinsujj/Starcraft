package com.example.starcraft;

import java.util.List;
import java.util.ArrayList;

/*
 * 책임: 플레이어의 자원 관리 및 행동 수행.
 * 메시지: takeTurn(), collectResources(), buildUnits(), attack()
 */
public class Player {
    private String name;
    private Race race;
    private int resources;
    private List<Unit> units;
    private List<Building> buildings;

    public Player(String name, Race race){
        this.name = name;
        this.race = race;
        this.resources = 100;
        this.units = new ArrayList<>();
        this.buildings = new ArrayList<>();
    }

    public void takeTurn() {
        collectResources();
        buildUnits();
        attack();
    }

    private void collectResources(){
        // 자원 수집 로직
    }

    private void buildUnits(){
        // 유닛 생성 로직
    }

    private void attack(){
        // 공격 로직 
    }

    public boolean isDefeated(){
        return units.isEmpty() && buildings.isEmpty();
    }

}
