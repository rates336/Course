package com.kodilla.exception.io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FileReaderTestSuite {
    @Test
    void testReadFileIfYes() {
        //Given
        TheFileReader fileReader = new TheFileReader();
        //When & Then
        assertDoesNotThrow(() -> fileReader.readFile("names.txt"));
    }
    @Test
    void whenFileDoesNotExistsReadFileShouldThrowException() {
        // given
        TheFileReader fileReader = new TheFileReader();
        String fileName = "theFileIsNotExist.txt";
        // when & then
        assertThrows(FileReaderException.class, () -> fileReader.readFile(fileName));
    }
    @Test
    public void testReadFileWitName() {
        //Given
        TheFileReader fileReader = new TheFileReader();
        //When & Then
        assertAll(
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile("theFileIsNotExist.txt")),
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile(null)),
                () -> assertDoesNotThrow(() -> fileReader.readFile("names.txt"))

        );
    }

}
