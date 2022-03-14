<<<<<<< HEAD
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
=======
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
>>>>>>> 77c2a98f1f56e569d4fd4f26e649e8d0068ac57c
