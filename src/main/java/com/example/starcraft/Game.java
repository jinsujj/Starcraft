package com.example.starcraft;

import com.example.starcraft.race.*;
import java.util.List;

/*
 * 책임: 게임의 전체적인 흐름을 관리
 * 메시지: start(), isGameOver(), playTurn()
 */

public class Game {
    private List<Player> players;
    private int currentTune;

    public Game(List<Player> players){
        this.players = players;
        this.currentTune =0;
    }

    public void start(){
        System.out.println("게임 시작!");
        while(!isGameOver()){
            playTurn();
            currentTune++;
        }
    }

    private boolean isGameOver(){
        return players.stream().anyMatch(Player::isDefeated);
    }

    private void playTurn(){
        System.out.println("턴: " + currentTune +" 시작");
        for(Player player : players){
            player.takeTurn();
        }
    }
    
    public static void main(String[] atgs){
        Race terranRace = new Terran();
        Race protossRace = new Protoss();
        Race zergRace = new Zerg();
        Player player1 = new Player("Player1", terranRace);
        Player player2 = new Player("Player2", zergRace);
        Game game = new Game(List.of(player1, player2));
        game.start();
    }
}
