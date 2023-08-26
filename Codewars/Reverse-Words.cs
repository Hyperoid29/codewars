/*
DESCRIPTION:
Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.

Examples
"This is an example!" ==> "sihT si na !elpmaxe"
"double  spaces"      ==> "elbuod  secaps"
*/



//My Solution
using System;

public static class Kata
{
    public static string ReverseWords(string str)
    {
        string[] words = str.Split(' ');



        for (int i = 0; i < words.Length; i++)
        {
            words[i] = ReverseStrings(words[i]);
        }

        return string.Join(" ", words);
    }


    public static string ReverseStrings(string str)
    {

        char[] charArray = str.ToCharArray();
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