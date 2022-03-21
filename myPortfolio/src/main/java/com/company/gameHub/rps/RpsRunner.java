package com.company.gameHub.rps;

import com.company.gameHub.theUserDate.User;

public class RpsRunner {

    public static void main(String[] args) {
        RpsEngine engine = new RpsEngine();
        RpsInfo info = new RpsInfo();
        info.hello();
//        info.settingsInfo();
        engine.setSettingsAll();




        String computerType = engine.drawMachine();
        System.out.println("Computer selected");
        info.showOptions();
        String yourType = engine.tabOfOptions(engine.intInput());
        System.out.println("Computer drew: " + computerType);
        System.out.println("And you selected: " + yourType);
        if(computerType == "Rock") {
            switch (yourType) {
                case "Rock" :
                    System.out.println("Draw");
                    engine.counterOfWins(0, new User("Draw"));
                    break;
                case "Paper" :
                    System.out.println("You won");
                    engine.counterOfWins(1, new User("User"));
                    break;
                case "Scissors" :
                    System.out.println("You lost");
                    engine.counterOfWins(1, new User("Computer"));
                    break;
                default:
                    System.out.println("Wrong value");
            }
        }
    }
}