<<<<<<< HEAD
package com.company.gameHub.computer;

import com.company.gameHub.theUserDate.UserModel;

public class Computer implements UserModel {
    private String userName = "Computer";
    private int age = 2077;
    int computerWins = 0;

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
        return computerWins + number;
    }
}
=======
package com.company.gameHub.computer;

import com.company.gameHub.theUserDate.UserModel;

public class Computer implements UserModel {
    private String userName = "Computer";
    private int age = 2077;
    int computerWins = 0;

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
        return computerWins + number;
    }
}
>>>>>>> 77c2a98f1f56e569d4fd4f26e649e8d0068ac57c
