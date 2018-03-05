/**************************************************************
 * Proj5.java
 * Aryan Tayal / Thursday 4:30 / Dan Wager
 * This program will
 **************************************************************/

import java.util.*;

public class Proj5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int entry = 0;

        System.out.print("Big 12 Bank Midwest Morgage Calculation System");
        System.out.print("\nDeveloped by Aryan Tayal");
        System.out.print("\nPlease Enter the file name for the output file (without .txt): ");

        System.out.print("\nPlease choose the following choices below: \n1. Promotional Loan \n2. Unique Loan (enter in values) \n3. Exit Program ");
        System.out.print("\nPlease enter your selection (1-3): ");
        entry = Integer.parseInt(s.nextLine());
        if (entry == 1) {

        } else if (entry == 2) {

        } else if (entry == 3) {
            System.exit(0);
        } else {
            System.out.println("Invalid Entry, Please enter a value from 1-3");
            entry = Integer.parseInt(s.nextLine());
        }


    } // end main

    public static String getCustomerNumber(String customerNumber, Scanner s) {
        // Scanner s = new Scanner(System.in);
        System.out.print("Customer Number: ");
        if (s.nextLine().length() > 6 || s.nextLine().length() < 6) {
            System.out.print("Invalid Customer Number, please only enter 6 characters");
        } // end while loop

    } // end getCustomerNumber
    public static int getInterestRate(int interestRate) {
        Scanner s = new Scanner(System.in);
        System.out.print("Interest Rate: ");
        if (s.nextLine() > 9 || s.nextLine() < 2) {
            System.out.print("Invalid Interest: Please enter a interest rate between 2 and 9 ");
        } // end while loop

    } // end getInterestRate
    public static int getLoanTerm(int loanTerm) {
        Scanner s = new Scanner(System.in);
        System.out.print("Loan Term: ");
        if (s.nextLine() = 15 || !s.nextLine() = 20 || !s.nextLine() = 25 || !s.nextLine() = 30) {
            System.out.print("Invalid Loan Term, please choose from: 15, 20, 25, 25, 30 years");
        } // end while loop
    } // end getLoanTerm
    public static double getLoanAmount() {
        Scanner s = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        if (s.nextLine() < 50000 || s.nextLine() < 1000000) {
            System.out.print("Invalid Loan Amount: please enter an amount from 50,000 to 1,000,000 ");
        } // end while loop

    } // end getLoanAmount
    static void calculateMonthlyPayment() {

    } // end calculateMonthlyPayment
    static void calcTotalPayment() {

    } // end calculateMonthlyPayment
} // end class
