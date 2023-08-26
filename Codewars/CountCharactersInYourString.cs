/*
The main idea is to count all the occurring characters in a string. If you have a string like aba, then the result should be {'a': 2, 'b': 1}.

What if the string is empty? Then the result should be empty object literal, {}.
*/




//My Solution
using System;
using System.Collections.Generic;

public class Kata
{
    public static Dictionary<char, int> Count(string str)
    {
        int count = 1;

        Dictionary<char, int> dict = new Dictionary<char, int>();

        char[] stringCharacters = str.ToCharArray();

        foreach (char c in stringCharacters)
        {

            if (dict.ContainsKey(c))
            {
                dict[c] += count;
            }
            else
            {
                dict[c] = count;
            }
        }

        return dict;
    }
}