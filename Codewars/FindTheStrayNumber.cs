/*
You are given an odd-length array of integers, in which all of them are the same, except for one single number.

Complete the method which accepts such an array, and returns that single different number.

The input array will always be valid! (odd-length >= 3)

Examples
[1, 1, 2] ==> 2
[17, 17, 3, 17, 17, 17, 17] ==> 3
*/





//My Solution
using System;
using System.Collections.Generic;
using System.Linq;
class Solution
{
    public static int Stray(int[] numbers)
    {
        List<int> duplicatedList = new List<int>();
        List<int> uniqueList = new List<int>();

        for (int i = 0; i < numbers.Length; i++)
        {
            if (!duplicatedList.Contains(numbers[i]))
            {
                duplicatedList.Add(numbers[i]);
            }
            else
            {
                // Remove the number from duplicatedList if it's found again
                duplicatedList.Remove(numbers[i]);
            }
        }

        // Return the remaining element in duplicatedList (the unique number)
        return duplicatedList[0];
    }
}