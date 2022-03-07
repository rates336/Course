package com.company.gameHub.statistics;

import java.util.HashMap;
import java.util.Map;

public class Statistic implements StatsModel {
    private Map<String, Integer> gamesStats = new HashMap<>();

    public Map<String, Integer> getGamesStats() {
        return gamesStats;
    }

    public void setGamesStats(Map<String, Integer> gamesStats) {
        this.gamesStats = gamesStats;
    }

    public void showGameStats() {

    }
    public void addGameStats() {

    }
}
