package com.bridgelabz.moodanalyser;

public class MoodAnalyserMain {
    public static void main(String[] args) {
        System.out.println("-------- Welcome To Mood Analyser Program --------");
        System.out.println();

        // Create object
        MoodAnalyser moodAnalyser = new MoodAnalyser();

        // Pass Happy message
        System.out.println(moodAnalyser.analyseMood("My name is Snehal"));

        // Pass Sad message
        System.out.println(moodAnalyser.analyseMood("I am in Sad Mood"));
    }
}
