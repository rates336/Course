package com.company.gameHub.theUserDate;

public class User implements UserModel {
    private String userName;
    private int age;
    int userWins = 0;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int userTempWinsUpdate(int number) {
        return userWins + number;
    }
}
