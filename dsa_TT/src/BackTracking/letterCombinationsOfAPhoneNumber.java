package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class letterCombinationsOfAPhoneNumber {
	//Array of Strings containing phone keys
    String phoneKeys[] = {"", "", "abc", "def", "ghi","jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    public List<String> letterCombinationsHelper(String digits) {
        if(digits.length() == 0){
            List<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        
        //Get the first character from the String (e.g digits)
        char firstChar = digits.charAt(0);
        //get the index so convert character into int
        int index = firstChar - '0';
        String phoneKey = phoneKeys[index]; //get the phone key
        String remString = digits.substring(1);
        List<String> finalList = new ArrayList<>();
        
        for(int i=0; i<phoneKey.length(); i++){
            List<String> result = letterCombinationsHelper(remString);
            for(String s: result){
                finalList.add(phoneKey.charAt(i) + s);
            }
        }
        return finalList;
    }
    
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            List<String> list = new ArrayList<>();
            return list;
        }
        
        return letterCombinationsHelper(digits);
    }
    
    public static void main(String[] args) {
		letterCombinationsOfAPhoneNumber l = new letterCombinationsOfAPhoneNumber();
		System.out.println(l.letterCombinations("2387"));
	}
}
