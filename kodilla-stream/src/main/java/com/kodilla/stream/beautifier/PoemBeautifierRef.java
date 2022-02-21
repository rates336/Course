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

}
