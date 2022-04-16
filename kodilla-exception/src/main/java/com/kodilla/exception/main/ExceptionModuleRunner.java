package com.kodilla.exception.main;


import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;
import com.kodilla.exception.io.TheFileReader;


import java.io.File;



public class ExceptionModuleRunner {

    public static void main(String[] args) {
        TheFileReader theFileReader = new TheFileReader();
        try {
            theFileReader.readFile("names.txt");
        } catch (FileReaderException e) {
            System.out.println("Some error");
        }
    }
}

