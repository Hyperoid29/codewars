/*
 An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.

Example: (Input --> Output)

"Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)

isIsogram "Dermatoglyphics" = true
isIsogram "moose" = false
isIsogram "aba" = false */

//My Solution

import java.util.HashMap;

public class Isograms {
    public static boolean isIsogram(String str) {
        String strLowercase = str.toLowerCase();
        HashMap<Character, Character> hash = new HashMap<>();

        if (strLowercase == "") {
            return true;
        }

        for (char s : strLowercase.toCharArray()) {
            if (hash.containsKey(s)) {
                return false;
            } else {
                hash.put(s, s);
            }
        }

        return true;

    }
}