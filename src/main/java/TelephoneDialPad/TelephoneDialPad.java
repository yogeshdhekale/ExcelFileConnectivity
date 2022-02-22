package TelephoneDialPad;

import java.util.LinkedList;
import java.util.List;

public class TelephoneDialPad {

    public static String dialPadMap[][] = {
            {"0"}, {"1"}, {"A", "B", "C"}, {"D", "E", "F"}, {"G", "H", "I"},
            {"J", "K", "L"}, {"M", "N", "O"}, {"P", "Q", "R", "S"},
            {"T", "U", "V"}, {"W", "X", "Y", "Z"}
    };

    protected  static void calculateAlphabetCombinations(List<String> combinationList, String prefixVar, String remainingVar) {
        int digitVar = Integer.parseInt(remainingVar.substring(0, 1));
        //System.out.println("Dial pad digit is :" + digitVar);
        if (remainingVar.length() == 1) {
            for (int i = 0; i < dialPadMap[digitVar].length; i++) {
                combinationList.add(prefixVar + dialPadMap[digitVar][i]);
            }
            System.out.println("Combination of alphabets for dial pad digit is " + combinationList);
            System.out.println("Combination size is: " + combinationList.size());
        } else {
            for (int i = 0; i < dialPadMap[digitVar].length; i++) {
                calculateAlphabetCombinations(combinationList,
                        prefixVar + dialPadMap[digitVar][i], remainingVar.substring(1));
            }
        }
    }

    public static LinkedList<String> retrieveCombinations(String digitInput) {
        LinkedList<String> combinationList = new LinkedList<>();
        calculateAlphabetCombinations(combinationList, "", digitInput);
        return combinationList;
    }
}
