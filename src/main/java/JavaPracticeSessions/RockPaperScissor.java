package JavaPracticeSessions;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

    public static void main(String[] args) {

        int userInput;
        int computerInput;

        Random num = new Random();
        computerInput = num.nextInt(3);
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter one value as below:\n0 for rock, \n1 for paper, \n2 for scissor");
        userInput = scn.nextInt();

        if(userInput == computerInput){
            System.out.println("Its a draw. Please play again.");
        }
        else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1) {
            System.out.println("User is won.");
        }
        else {
            System.out.println("Computer is won.");
        }
        System.out.println("Userinput: " + userInput);
        System.out.println("ComputerInput: " + computerInput);
    }
}
