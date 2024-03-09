package Questions;

import java.util.*;

public class groupanagrams {

    public static List<List<String>> groupAnagrams(String[] strings) {
        Map<String, List<String>> anagramGroups = new HashMap<>();//created a new hashmap

        for (String string : strings) {//iterating throughout the string
            char[] chars = string.toCharArray();//converting string into array so that we can sort the characters
            Arrays.sort(chars);//sorting the character
            String canonical = new String(chars);//converting the the array back to the string

            if (anagramGroups.containsKey(canonical)) {//if it already contains the key
                anagramGroups.get(canonical).add(string);//add to the map
            } else {
                List<String> group = new ArrayList<>();//else make a new arraylist
                group.add(string);
                anagramGroups.put(canonical, group);//put like this {"",""};
            }
        }

        return new ArrayList<>(anagramGroups.values());
    }


    public static void main(String[] args) {
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));

        /*
            EXPECTED OUTPUT:
            ----------------
            1st set:
            [[eat, tea, ate], [tan, nat], [bat]]

            2nd set:
            [[abc, cba, bac], [foo], [bar]]

            3rd set:
            [[listen, silent], [triangle, integral], [garden, ranged]]

        */

    }

    }

