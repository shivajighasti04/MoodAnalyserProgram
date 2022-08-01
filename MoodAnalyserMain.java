package com.bridgelabz.moodanalyser;

public class MoodAnalyserMain {
    public static void main(String[] args) {
        System.out.println(".........Welcome To Mood Analyser Program..........");

        //Create Object
        MoodAnalyser moodAnalyser = new MoodAnalyser();

        //Pass Happy Message
        System.out.println(moodAnalyser.analyseMood("I am in happy mood"));

        //Pass Sad Message
        System.out.println(moodAnalyser.analyseMood("I am in sad mood"));
    }
}
