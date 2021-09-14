package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        double weight, height, BMI;
        System.out.print("What is your weight in pounds? ");
        weight = input.nextDouble();
        System.out.print("What is your height in inches? ");
        height = input.nextDouble();

        BMI= (weight/(height*height))*703;
        System.out.printf("Your BMI is %.1f.\n", BMI);
        if(BMI>18.5 && BMI< 25) {
            System.out.print("You are within the ideal weight range.");
        }
        else{
            System.out.print(((BMI<=18.5)? "You are underweight.": "You are overweight.")+" You should see a doctor.");
        }
    }
}
