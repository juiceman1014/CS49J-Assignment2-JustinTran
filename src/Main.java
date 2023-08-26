/*
 * Author: Justin Tran 017335461
 * File: Main.java
 * Description: program takes a set amount of words from the user and checks for the number of n's in each word.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int numberLoops = 0;
        int nCounter = 0;
        int userAttempts;

        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter the max number of loops: ");
        userAttempts = scnr.nextInt();
        System.out.println("Max tries is " + userAttempts);

        while(numberLoops != userAttempts) {
            System.out.print("Please enter a word: ");
            String userWord = scnr.next();
            numberLoops++;

            for (int i = 0; i < userWord.length(); i++) {
                char userLetter = userWord.charAt(i);
                if (userLetter == 'n') {
                    nCounter++;
                }
            }
            System.out.println("word: " + userWord + " has " + nCounter + " letter n's");
            nCounter = 0;
        }
    }
}