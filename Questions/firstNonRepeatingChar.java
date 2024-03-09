package Questions;

import java.util.ArrayList;
import java.util.HashMap;

public class firstNonRepeatingChar {

    public static Character firstNonRepeatingChar(String string){
        HashMap<Character,Integer> charCount = new HashMap<>();
        for(int i= 0; i<string.length();i++){
            char c = string.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);

        }
        for(int i=0;i<string.length();i++){
            char c = string.charAt(i);
            if(charCount.get(c)==1){
                return c;

            }
        }
        return null;


    }




    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));

        /*
            EXPECTED OUTPUT:
            ----------------
            l
            h
            null

        */

    }
}
