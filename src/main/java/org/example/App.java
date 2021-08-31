import java.util.Scanner;
import java.lang.Math;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 julian londono
 */
public class App 
{
    public static final double conversion = 0.092990304;

    public static void main( String[] args )
    {

        Scanner input = new Scanner(System.in);

        System.out.println( "What is the length of the room in feet? " );
        double length = input.nextDouble();
        System.out.println("What is the width of the room in feet? ");
        double width = input.nextDouble();

        double area_imp = length * width;
        double area_met = (double) Math.round(area_imp * conversion * 1000)/1000;

        System.out.println("You entered the dimensions " + length + " feet " + " by " + width + " feet");
        System.out.println("The area is ");
        System.out.println(area_imp + " square feet");
        System.out.println(area_met + " square meters");
    }
}
