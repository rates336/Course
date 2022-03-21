package com.company.gameHub.games;

import com.company.gameHub.statistics.Statistic;
import com.company.gameHub.statistics.StatsModel;

import java.util.List;

public interface Game {
    String getGameName();
    void saveStats(StatsModel stats);
    StatsModel getStats();

}