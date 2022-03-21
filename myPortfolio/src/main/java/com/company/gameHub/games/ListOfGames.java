package com.company.gameHub.games;

import java.util.ArrayList;
import java.util.List;

public final class ListOfGames {
    private static final List<Game> listOfGames = new ArrayList<>();
    public static List<Game> getListOfGames() {
        return listOfGames;
    }
    public void addGame(Game game) {
        listOfGames.add(game);
    }
    public void removeGame(Game game) {
        listOfGames.remove(game);
    }
    public static void showList() {
        for (int i = 0; i < getListOfGames().size(); i++) {
            System.out.println((i + 1) + " - " + getListOfGames().get(i).getGameName());
        }

    }
}