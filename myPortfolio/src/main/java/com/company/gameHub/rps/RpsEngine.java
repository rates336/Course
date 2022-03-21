package com.company.gameHub.rps;

import com.company.gameHub.theUserDate.User;

import java.util.regex.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class RpsEngine {
    Scanner s = new Scanner(System.in);
    Random r = new Random();
    Map<String, Integer> gameSettings = new HashMap<>();
    String[] tab;
    int counter = 0;
    int allTabSize = 5;
    boolean[] settingsOnOf = new boolean[allTabSize];
    String[] settingsNames = new String[allTabSize];
    String[] difficultyLevels = new String[5];
    RpsInfo info = new RpsInfo();
    RpsEngine engine = new RpsEngine();

    public String getSettingsNames(int number) {
        return settingsNames[number];
    }

    public char charInput() {
        return s.next().charAt(0);
    }
    public int intInput() {
        return s.nextInt();
    }
    public String stringInput() {
        return s.next();
    }
    public String tabOfOptions(int number) {
        tab = new String[3];
        tab[0] = "Rock";
        tab[1] = "Paper";
        tab[2] = "Scissors";
        return tab[number % 3];
    }
    public String drawMachine() {
        return tabOfOptions(r.nextInt(2));
    }
    public void counterOfWins(int number, User user) {
        user.userTempWinsUpdate(number);
    }
    public void createNamesSettings() {
        settingsNames[0] = "Quantity Sets";
        settingsNames[1] = "Quantity rounds";
        settingsNames[2] = "Extra gestures";
        settingsNames[3] = "Hard mode";
        settingsNames[4] = "Statistic";
    }
    public void createDifficultyLevels() {
        difficultyLevels[0] = "Easy";
        difficultyLevels[1] = "Normal";
        difficultyLevels[2] = "Hard";
        difficultyLevels[3] = "Very Hard";
        difficultyLevels[4] = "In future";
    }
    public boolean setSettingsGame1() {
        createNamesSettings();
        settingsOnOf[counter] = false;
        System.out.println("Do you want play with sets?");

        switch (charInput()) {
            case 'Y':
            case 'y':
            case 'T':
            case 't':
                settingsOnOf[counter] = true;
                System.out.println("How many sets you want play?");
                gameSettings.put(settingsNames[counter], intInput());
                counter++;
                info.successful();
                break;
            case 'N':
            case 'n':
            case 'F':
            case 'f':
                settingsOnOf[counter] = false;
                gameSettings.put(settingsNames[counter], 1);
                counter++;
                info.successful();
                break;
            case 'D':
            case 'd':
                info.defaultSettingsInfo(settingsNames[counter]);
                break;
            default:
                info.wrongDate();
                info.settingsInfo(settingsNames[counter]);
                engine.setSettingsGame1();
        }
        return settingsOnOf[counter - 1];
    }
    public boolean setSettingsGame2() {
        settingsOnOf[counter] = false;
        System.out.println("Do you want play with rounds?");
        System.out.println("You can also play one-round game");

        switch (charInput()) {
            case 'Y' :
            case 'y' :
            case 'T' :
            case 't' :
                settingsOnOf[counter] = true;
                System.out.println("How many rounds in one sets?");
                gameSettings.put(settingsNames[counter], intInput());
                counter++;
                info.successful();
                break;
            case 'N' :
            case 'n' :
            case 'F' :
            case 'f' :
                settingsOnOf[counter] = false;
                gameSettings.put(settingsNames[counter], 1);
                counter++;
                info.successful();
                break;
            case 'D' :
            case 'd' :
                info.defaultSettingsInfo(settingsNames[counter]);
                break;
            default:
                info.wrongDate();
                info.settingsInfo(settingsNames[counter]);
                engine.setSettingsGame2();
        }
        return settingsOnOf[counter - 1];
    }
    public boolean setSettingsGame3() {
        settingsOnOf[counter] = false;
        System.out.println("Do you want play with two extra gestures?");
        System.out.println("If you want know more about the mode write info - i");
        System.out.println("You can change the mode when you finish all yours sets");

        switch (charInput()) {
            case 'Y' :
            case 'y' :
            case 'T' :
            case 't' :
                settingsOnOf[counter] = true;
                gameSettings.put(settingsNames[counter], 5);
                counter++;
                info.successful();
                break;
            case 'N' :
            case 'n' :
            case 'F' :
            case 'f' :
                settingsOnOf[counter] = false;
                gameSettings.put(settingsNames[counter], 3);
                counter++;
                info.successful();
                break;
            case 'D' :
            case 'd' :
                info.defaultSettingsInfo(settingsNames[counter]);
                break;
            default:
                info.wrongDate();
                info.settingsInfo(settingsNames[counter]);
                engine.setSettingsGame3();
        }
        return settingsOnOf[counter - 1];
    }
    public boolean setSettingsGame4() {
        createDifficultyLevels();
        settingsOnOf[counter] = false;
        System.out.println("Do you want modify difficulty level? Now set is normal");
        System.out.println("If you want know more about about difficult levels enter info - i");
        System.out.println("If you want want play on normal level enter No - n");

        switch (charInput()) {
            case 'Y' :
            case 'y' :
            case 'T' :
            case 't' :
                setSettingsGame4c1();

            case 'N' :
            case 'n' :
            case 'F' :
            case 'f' :
                settingsOnOf[counter] = false;
                gameSettings.put(settingsNames[counter], 3);
                counter++;
                info.successful();
                break;
            case 'D' :
            case 'd' :
                info.defaultSettingsInfo(settingsNames[counter]);
                break;
            default:
                info.wrongDate();
                info.settingsInfo(settingsNames[counter]);
                engine.setSettingsGame3();
        }
        return settingsOnOf[counter - 1];
    }
    public void setSettingsGame4c1() {
        info.settingsInfo(settingsNames[counter]);
        char temp = charInput();
        switch (temp) {
            case 'E' :
            case 'e' :
                settingsOnOf[counter] = true;
                gameSettings.put("Difficult level", 1);
                counter++;
                info.successful();
                break;
            case 'N' :
            case 'n' :
            case 'D' :
            case 'd' :
                settingsOnOf[counter] = false;
                gameSettings.put(settingsNames[counter], 2);
                counter++;
                info.successful();
                break;
            case 'H' :
            case  'h' :
                settingsOnOf[counter] = true;
                gameSettings.put(settingsNames[counter], 3);
                counter++;
                info.successful();
                break;
            case 'V' :
            case 'v' :
                gameSettings.put(settingsNames[counter], 4);
                counter++;
                info.successful();
                break;
            default:
                info.wrongDate();
                setSettingsGame4c1();
        }
    }
    public boolean setSettingsGame5() {
        settingsOnOf[counter] = false;
        System.out.println("Do you want creating statistics?");
        switch (charInput()) {
            case 'Y' :
            case 'y' :
            case 'T' :
            case 't' :
                settingsOnOf[counter] = true;
                gameSettings.put(settingsNames[counter], 1);
                counter++;
                info.successful();
                break;
            case 'N' :
            case 'n' :
            case 'F' :
            case 'f' :
                settingsOnOf[counter] = false;
                gameSettings.put(settingsNames[counter], 0);
                counter++;
                info.successful();
                break;
            case 'D' :
            case 'd' :
                info.defaultSettingsInfo(settingsNames[counter]);
                break;
            default:
                info.wrongDate();
                info.settingsInfo(settingsNames[counter]);
                engine.setSettingsGame3();
        }
        return settingsOnOf[counter - 1];
    }
    public void setDefaultSettingsGame1() {
        String dateInput = stringInput();

        if(Pattern.matches("[1-9]", dateInput.substring(0,1))) {
            settingsOnOf[0] = true;
            gameSettings.put(settingsNames[0], intInput());
        } else {
            switch (dateInput.charAt(0)) {
                case 'Y' :
                case 'y' :
                    gameSettings.put(settingsNames[0], 3);
                    info.successful();
                    break;
                case 'N' :
                case 'n' :
                    gameSettings.put(settingsNames[0], 1);
                    info.successful();
                    break;
                default:
                    info.wrongDate();
                    info.defaultSettingsInfo(settingsNames[0]);
                    engine.setDefaultSettingsGame1();
            }
        }
    }
    public void setDefaultSettingsGame2() {
        String dateInput = stringInput();
        if(Pattern.matches("[1-9]", dateInput.substring(0,1))) {
            settingsOnOf[counter - (settingsOnOf.length - 1)] = true;
            gameSettings.put("Quantity Sets", intInput());
        } else {
            switch (dateInput.charAt(0)) {
                case 'Y' :
                case 'y' :
                    gameSettings.put("Quantity Sets", 3);
                    info.successful();
                    break;
                case 'N' :
                case 'n' :
                    gameSettings.put("Quantity Sets", 1);
                    info.successful();
                    break;
                default:
                    System.out.println("You entered wrong value");
                    info.defaultSettingsInfo(settingsNames[counter]);
                    engine.setDefaultSettingsGame1();
            }
        }
    }
/*    public void setDefaultSettingsGame3() {
        String dateInput = stringInput();
        if(Pattern.matches("[1-9]", dateInput.substring(0,1))) {
            settingsOnOf[counter - (settingsOnOf.length - 1)] = true;
            gameSettings.put("Quantity Sets", intInput());
        } else {
            switch (dateInput.charAt(0)) {
                case 'Y' :
                case 'y' :
                    gameSettings.put("Quantity Sets", 3);
                    info.successful();
                    break;
                case 'N' :
                case 'n' :
                    gameSettings.put("Quantity Sets", 1);
                    info.successful();
                    break;
                default:
                    System.out.println("You entered wrong value");
                    info.defaultSettingsInfo();
                    engine.setDefaultSettingsGame1();
            }
        }
    }
    public void setDefaultSettingsGame4() {
        String dateInput = stringInput();
        if(Pattern.matches("[1-9]", dateInput.substring(0,1))) {
            settingsOnOf[counter - (settingsOnOf.length - 1)] = true;
            gameSettings.put("Quantity Sets", intInput());
        } else {
            switch (dateInput.charAt(0)) {
                case 'Y' :
                case 'y' :
                    gameSettings.put("Quantity Sets", 3);
                    info.successful();
                    break;
                case 'N' :
                case 'n' :
                    gameSettings.put("Quantity Sets", 1);
                    info.successful();
                    break;
                default:
                    System.out.println("You entered wrong value");
                    info.defaultSettingsInfo();
                    engine.setDefaultSettingsGame1();
            }
        }
    }
    public void setDefaultSettingsGame5() {
        String dateInput = stringInput();
        if(Pattern.matches("[1-9]", dateInput.substring(0,1))) {
            settingsOnOf[counter - (settingsOnOf.length - 1)] = true;
            gameSettings.put("Quantity Sets", intInput());
        } else {
            switch (dateInput.charAt(0)) {
                case 'Y' :
                case 'y' :
                    gameSettings.put("Quantity Sets", 3);
                    info.successful();
                    break;
                case 'N' :
                case 'n' :
                    gameSettings.put("Quantity Sets", 1);
                    info.successful();
                    break;
                default:
                    System.out.println("You entered wrong value");
                    info.defaultSettingsInfo();
                    engine.setDefaultSettingsGame1();
            }
        }
    }*/
    public void setSettingsAll() {
            engine.setSettingsGame1();
            engine.setSettingsGame2();
            engine.setSettingsGame3();
            engine.setSettingsGame4();
            engine.setSettingsGame5();
    }
}