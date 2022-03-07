package com.company.gameHub.statistics;

import com.company.gameHub.games.Game;

import java.util.Map;

public interface StatsModel {
    Map<String, Integer> gamesStats = null;
    void showGameStats();
    void addGameStats();


}
