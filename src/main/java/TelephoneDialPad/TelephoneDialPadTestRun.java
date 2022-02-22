package TelephoneDialPad;
import java.util.Scanner;
/*
    Telephone Dial Pad Test Run Program
    This program will accept numeric input from 0 to 9 from user and will print
    corresponding possible combination of alphabets for that numeric.
 */

public class TelephoneDialPadTestRun {
    public static void main(String[] args) {
        TelephoneDialPad.retrieveCombinations(userInputfunction());
    }
/*
        userInputfunction() will accept the user input from User through Scanner class.
        Conditions:
        1. User should enter input numeric value from 0 to 99999
        2. For other than numeric values (String or special characters), console will give an error message.
 */
    public static String userInputfunction() {
        Scanner sc = new Scanner(System.in);
        int userInput = 0;
        String input;
        boolean isInputValid;
        do {
            isInputValid = true;
            System.out.println("Please enter a numeric value from 0 to 2147483646:");
            input = sc.nextLine();
            try {
                userInput = Integer.parseInt(input);
                if (userInput < 0 || userInput >= Integer.MAX_VALUE) {
                    isInputValid = false;
                    System.out.println("Wrong integer input. Telephone Dial Pad will accept a numeric value from 0 to " + Integer.MAX_VALUE);
                }
            }
            catch (NumberFormatException e){
                isInputValid = false;
                System.out.println("Input is invalid. Telephone Dial Pad will accept a numeric value from 0 to " + Integer.MAX_VALUE);
            }
        } while (!isInputValid);

        String userString = Integer.toString(userInput);
        String userString1 = String.valueOf(userString);
        System.out.println("Value of userString1 is " + userString1);
        return userString;
    }
}