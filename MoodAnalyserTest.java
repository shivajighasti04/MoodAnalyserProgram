package com.bridgelabz.moodanalysertest;

import com.bridgelabz.moodanalyser.MoodAnalyser;
import com.bridgelabz.moodanalyser.MoodAnalyserException;
import org.junit.Test;
import org.junit.Assert;
public class MoodAnalyserTest {
    // -----------------Test for Sad-----------
    @Test
    public void givenMessageWhenSadShouldBeReturnSad() {
        // create object and set message
        MoodAnalyser moodeAnalyser = new MoodAnalyser("I am in Sad mood");
        String expectedValue = "SAD";
        String mood;
        try {
            mood = moodeAnalyser.analyseMood();
            Assert.assertEquals(expectedValue, mood);
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
    }

    // ---------------Test for Happy---------------
    @Test
    public void givenMessageWhenHappyShouldBeReturnHappy() {
        // create object and ser message
        MoodAnalyser moodeAnalyser = new MoodAnalyser("I am Happy");
        String expectedValue = "HAPPY";
        String mood;
        try {
            mood = moodeAnalyser.analyseMood();
            Assert.assertEquals(expectedValue, mood);
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
    }
}

