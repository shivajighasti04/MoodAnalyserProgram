package com.bridgelabz.moodanalysertest;

import com.bridgelabz.moodanalyser.MoodAnalyser;
import org.junit.Test;
import org.junit.Assert;
public class MoodAnalyserTest {
    // -----------------Test for Sad-----------
    @Test
    public void givenMessageWhenSadShouldBeReturnSad() {
        // create object
        MoodAnalyser moodeAnalyser = new MoodAnalyser();
        String expectedValue = "SAD";
        String mood = moodeAnalyser.analyseMood("I am in Sad Mood");
        Assert.assertEquals(expectedValue, mood);
    }

    // ---------------Test for Happy---------------
    @Test
    public void givenMessageWhenHappyShouldBeReturnHappy() {
        // create object
        MoodAnalyser moodeAnalyser = new MoodAnalyser();
        String expectedValue = "HAPPY";
        String mood = moodeAnalyser.analyseMood("I am in Happy Mood");
        Assert.assertEquals(expectedValue, mood);
    }
}

