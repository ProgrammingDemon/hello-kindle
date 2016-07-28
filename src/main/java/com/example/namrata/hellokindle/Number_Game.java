package com.example.namrata.hellokindle;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class Number_Game extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbergame);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
/*
    public static void main(String[] args)
    {
        int num = (int)(Math.random()*21);
        int num2 = (int)(Math.random()*6 + 1); //selects number between 1 and 5
        String animal = getAnimal(num);
        System.out.println("You have " + num + " " + animal + ".\n"
            + "If you add " + num2 + " more, how many will you have?");
    }
    public static String getAnimal(int number) {
        int rand = (int)(Math.random()*4); //random number generated between 0 and 3, inclusive
        if(number == 1) //singular number
        {
            if(rand == 0) {
                return "dog";
            }
            else if(rand == 1) {
                return "cat";
            }
            else {
                return "bird";
            }
        }
        else {
            if(rand == 0) {
                return "dogs";
            }
            else if(rand == 1) {
                return "cats";
            }
            else {
                return "birds";
            }
        }
    }
    */
}