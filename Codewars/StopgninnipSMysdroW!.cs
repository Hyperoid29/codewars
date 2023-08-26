/*
Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.

Examples:

spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw" 
spinWords( "This is a test") => returns "This is a test" 
spinWords( "This is another test" )=> returns "This is rehtona test"
*/



//My Solution
using System.Collections.Generic;
using System.Linq;
using System;

public class Kata
{
    public static string SpinWords(string sentence)
    {
        string[] words = sentence.Split(' ');



        for (int i = 0; i < words.Length; i++)
        {

            if (words[i].Length > 4)
            {
                words[i] = ReverseStrings(words[i]);
            }
            else
            {
                words[i] = words[i];
            }

        }

        return string.Join(" ", words);
    }

    public static string ReverseStrings(string sentence)
    {

        char[] charArray = sentence.ToCharArray();
        int left = 0;
        int right = charArray.Length - 1;


        while (left < right)
        {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }

        return new string(charArray);
    }
}