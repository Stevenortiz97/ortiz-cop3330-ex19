/*
 *  UCF COP3330 Summer 2021 Assignment 19
 *  Copyright 2021 Steven Ortiz
 */


//bmi = (weight / (height × height)) * 703

//Your BMI is 19.5.
//You are within the ideal weight range.
//or

//Your BMI is 32.5.
//You are overweight. You should see your doctor.

package org.example;

import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("What is your current body weight? ");

        double weight = input();

        System.out.print("What is your current height? (in inches) ");

        double height = input();

        double bmi = (weight/(height*height) ) * 703;

        System.out.println("Your BMI is "+String.format("%.2f",bmi));

        if(bmi < 18.5 ){

            System.out.println("You are underweight, you need to see a doctor.");
        }
        else if(bmi>25 ){

            System.out.println("You are overweight, you need to see a doctor.");
        }
        else if (bmi>18.5 && bmi<25){

            System.out.println("You are within the ideal weight range.");
        }
    }
    private static double input(){

        return in.nextInt();
    }
}