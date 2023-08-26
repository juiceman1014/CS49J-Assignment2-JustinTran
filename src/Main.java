import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //Set numberLoops to 0
        int numberLoops = 0;
        int nCounter = 0;
        int userAttempts;

        //Ask for userAttempts
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the max number of loops: ")
        userAttempts = scnr.nextInt();
        System.out.println("Enter the max number of loops: ")

        //While numberLoops != userAttempts
        while(numberLoops != userAttempts) {
            //Ask user to enter a word
            String userWord = scnr.next();
            //String userWord = "nnhello";
            //increment one to userAttempts
            numberLoops++;

            //For (int i = 0, i<word length, i++)
            for (int i = 0; i < userWord.length(); i++) {
                //if specific character = "n"
                char userLetter = userWord.charAt(i);
                if (userLetter == 'n') {
                    nCounter++;
                }
            }

        }

        System.out.println(nCounter);
    }
}