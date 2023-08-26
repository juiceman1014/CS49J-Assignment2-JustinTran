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
            if(nCounter != 1) {
                System.out.println("word: " + userWord + " has " + nCounter + " letter n's");
            }else{
                System.out.println("word: " + userWord + " has " + nCounter + " letter n");
            }
            nCounter = 0;
        }
    }
}

/*
/Users/justintran/Library/Java/JavaVirtualMachines/openjdk-20.0.2/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=53199:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/justintran/F23-CS49J/CS49J-Assignment2-JustinTran/out/production/CS49J-Assignment2-JustinTran Main
        Enter the max number of loops: 5
        Max tries is 5
        Please enter a word: abc
        word: abc has 0 letter n's
        Please enter a word: xyz
        word: xyz has 0 letter n's
        Please enter a word: nine
        word: nine has 2 letter n's
        Please enter a word: sun
        word: sun has 1 letter n
        Please enter a word: 123
        word: 123 has 0 letter n's

        Process finished with exit code 0
 */
