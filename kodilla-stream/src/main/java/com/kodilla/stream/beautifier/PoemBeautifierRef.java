package com.kodilla.stream.beautifier;

import java.util.Locale;

public class PoemBeautifierRef {
    public static String bStyle1(String text) {
        return "!!! " + text + " !!!";
    }

    public static String bStyle2(String text) {
        return  text.toUpperCase();
    }

    public static String bStyle3(String text) {
        return text.length() + " " + text;
    }

    public static String bStyle4(String text) {
        return text.charAt(0) + " " + text;
    }

    public static String bigNumberStyle(String text) {
        if(text.length() <= 3) {
            return text;
        }

        int modulo = text.length() % 3;
        String temp;
        if(modulo != 0)
            temp = "" + text.substring(0, modulo) + "_";
        else
            temp = text.substring(0, 3) + "_";

        String lastSection = text.substring(text.length() - 3);
        for (int i = 0; i < (text.length() / 3) - 1; i++) {
            temp = temp + text.substring(modulo, modulo + 3) + "_";
            modulo += 3;
        }
        temp += lastSection;
        return temp;
    }
}
