package com.company.gameHub;

import com.company.gameHub.games.Game;
import com.company.gameHub.theUserDate.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    Scanner s = new Scanner(System.in);
    Main main = new Main();
    public String dateInput() {
        return s.next();
    }
    public int numberInput() {
        return s.nextInt();
    }
    public char letterInput() {
        return s.next().charAt(0);
    }
    public static void addGameToList() {

    }
    public void hello() {
        System.out.println("Welcome in your personal Game Hub");
        System.out.println("Please Enter your name and press enter button.");
    }
    public void enterAge(User user) {
        System.out.println("Hi " + user.getUserName() + ',');
        boolean temp = true;
        char charTemp;
        while (temp) {
            System.out.println("Do you want tell what is your age?");
            System.out.println("Yes - y, No - n");
            charTemp = main.letterInput();
            switch (charTemp) {
                case 'y' :
                case 'Y' :
                    System.out.println(user.getUserName() + " enter your age");
                    user.setAge(main.numberInput());
                    temp = false;
                    break;
                case 'n' :
                case 'N' :
                    System.out.println(user.getUserName() + "Ok your age has set is 16");
                    System.out.println("You can change the value later.");
                    user.setAge(16);
                    temp = false;
                    break;

                default:
                    System.out.println("You entered wrong letter please use y or n");
                    temp = true;
            }
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        List<Game> listOfGames = new ArrayList<>();
        User user;
        main.hello();
        user = new User(main.dateInput());
        main.enterAge(user);

        System.out.println("Now you select game which you want to play");
        System.out.println("This is list of games");
        int counter = 0;
        for (Game game : listOfGames
             ) {
            System.out.println(listOfGames.indexOf(game) + " - ");

        }


    }

}
