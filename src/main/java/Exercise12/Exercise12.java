/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Bernard Fonrose
 */

package Exercise12;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args){

        Scanner interest = new Scanner(System.in);

        System.out.print("Please enter the Principal: ");

        double Principal = interest.nextInt();

        System.out.print("Please enter the rate of interest: ");

        double raw_rate = interest.nextDouble();

        System.out.print("Please enter the number of years: ");

        double years = interest.nextInt();

        double rate = raw_rate / 100;

        double raw_Investment = Principal*(1 + (rate * years));

        double investment = Math.round(raw_Investment *100)/100.0;

        System.out.printf("After %.1f years at %.2f%% , the Investment will be worth $%f",  years, raw_rate, investment);






    }
}
