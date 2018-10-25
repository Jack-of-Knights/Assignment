package java_lab_2b;

import java.util.Scanner;

public class Java_Lab_2b {


    public static void main(String[] args) {
        
        int dollars = 0;
        int half_dollars = 0;
        int quarters = 0;
        int dimes = 0;
        int nickles = 0;
        int pennies = 0;
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input the total in dollars and cents: \n");
        
        float money = input.nextFloat();
        
        while (money >= 1) {
            money -= 1;
            ++dollars;            
        }
        
        while (money >= 0.50) {
            money -= 0.50;
            ++half_dollars;
        }
        
        while (money >= 0.25) {
            money -= 0.25;
            ++quarters;
        }
        
        while (money >= 0.10) {
            money -= 0.10;
            ++dimes;
        }
        
        while (money >= 0.05) {
            money -= 0.05;
            ++nickles;
        }
        
        while (money > 0.00) {
            ++pennies;
            money -= 0.01;
        }
        
        System.out.println("\nDollars: " + dollars);
        System.out.println("Half-dollars: " + half_dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickles: " + nickles);
        System.out.println("Pennies: " + pennies);
    }
    
}