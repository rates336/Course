package com.company.gameHub.rps;



public class RpsInfo {
    RpsEngine engine = new RpsEngine();
    String[] tab;
    public void hello() {
        System.out.println("Hi you selected game:");
        System.out.println("Rock, Paper, Scissors");
        System.out.println("If you want exit during the game");
        System.out.println("you must wait to finish round and later");
        System.out.println("enter to chat \"exit\"");
    }
    public void showOptions() {
        for (String option : tab
        ) {
            System.out.println("1 - " + option);
        }
    }
    public String tabOfOptions(int number) {
        tab = new String[3];
        tab[0] = "Rock";
        tab[1] = "Paper";
        tab[2] = "Scissors";
        return tab[number % 3];
    }
    public void settingsInfo(String text) {
        System.out.println("For your the best impressions please select game modes");
        System.out.println("For the questions please get answer yes/no or true/false");
        System.out.println("You can also write one first letter, for example");
        System.out.println("Yes - y, No - n, True - t, False - f");
        System.out.println("You can also set default settings");
        System.out.println("If you want know more enter default - d");
        System.out.println();


        System.out.println("How many rounds you want play?");
        System.out.println("If you want don't define quantity now write -1 ");

    }
    public void defaultSettingsInfo(String text) {
        switch (text) {
            case "Quantity sets" :
            System.out.println("Default quantity sets is 3");
            System.out.println("Do you want set it? (Yes/No/Manual value)");
            System.out.println("If you want set manual value enter the value now");
            break;
            case "Quantity rounds" :

        }

    }
    public void successful() {
        System.out.println("The operation was successful.");
    }
    public void failed() {
        System.out.println("The operation failed.");
    }
    public void wrongDate() {
        System.out.println("You entered wrong verb, wrong letter or wrong number.");
    }
}