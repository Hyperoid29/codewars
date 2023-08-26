/*
Can you find the needle in the haystack?

Write a function findNeedle() that takes an array full of junk but containing one "needle"

After your function finds the needle it should return a message (as a string) that says:

"found the needle at position " plus the index it found the needle, so:

Example(Input --> Output)

["hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"] --> "found the needle at position 5" 
*/

//My Solution

public class Kata {
    public static String findNeedle(Object[] haystack) {
        String information = "found the needle at position ";
        String result = "";

        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == "needle") {
                result += information + i;
            }
        }

        return result;

    }
}
