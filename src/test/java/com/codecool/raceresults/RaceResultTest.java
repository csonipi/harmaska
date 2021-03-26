package com.codecool.raceresults;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import cccr.CCCRTestExecutionListener;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith({CCCRTestExecutionListener.class})
class RaceResultTest {

    @Test
    void printResultsWorks(){
        String expected = "Schumacher => 1995, 1997 Coultard => 1997, 2002 Hakkinen => 1999, 1998";
        assertEquals(expected,RaceResult.calculateRacerResults("src/main/resources/results.txt"));
    }

    @Test
    void correctErrorMessageForFileNotFound(){
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        RaceResult.calculateRacerResults("src/main/resources/notExisting.txt");
        assertEquals("File not found!",outputStreamCaptor.toString()
                .trim());
    }
}