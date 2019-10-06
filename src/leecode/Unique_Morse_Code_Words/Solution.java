package leecode.Unique_Morse_Code_Words;

import java.util.TreeSet;

public class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] alphabet= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        TreeSet<String> result = new TreeSet();
        for (String word : words) {
            StringBuilder tempString = new StringBuilder();
            for(int i = 0; i < word.length(); i ++){
                tempString.append(alphabet[word.charAt(i) - 'a']);
            }
            result.add(tempString.toString());
        }
        return result.size();
    }

}
