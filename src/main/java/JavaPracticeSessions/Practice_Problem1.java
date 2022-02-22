package JavaPracticeSessions;

import java.util.Random;
import java.util.Scanner;

public class Practice_Problem1 {
    public static void main(String[] args) {
        //Find a Leap Year
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a year e.g. 1900");
        short year = sc.nextShort();
        short rem4;
        short rem100;
        short rem400;
        rem4 =  (short) (year % 4);
        rem100 = (short) (year % 100);
        rem400 = (short) (year % 400);
        if(rem100 == 0 && rem400 != 0){
            System.out.println(year + " is not a leap year.");
        }
        else if (rem100 == 0){
            System.out.println(year + " is a leap year.");
        }
        else if (rem4 == 0){
            System.out.println(year + " is a leap year.");
        }
        else{
            System.out.println(year + " is not a leap year.");
        }

        //Rock_Paper_Scissor Game
        int machineInput;
        int userInput;
        Random number = new Random();
        machineInput = number.nextInt(3);
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter one value as below:\n0 for rock\n1 for paper\n2 for scissor");
        userInput = scn.nextInt();
        System.out.println(machineInput + " value is entered by PC");
        if (machineInput == userInput){
            System.out.println("Its a tie, please play again.");
        }
        else if (machineInput == 0){
            if (userInput == 1){
                System.out.println("User is winner");
            }
            else
                System.out.println("Machine is winner");
        }
        else if (machineInput == 1){
            if (userInput == 0){
                System.out.println("Machine is winner");
            }
            else
                System.out.println("User is winner");
        }
        else if (machineInput == 2){
            if (userInput == 0){
                System.out.println("User is winner");
            }
            else
                System.out.println("Machine is winner");
        }
    }
}
