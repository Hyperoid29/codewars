/*
Kata Task
I have a cat and a dog.

I got them at the same time as kitten/puppy. That was humanYears years ago.

Return their respective ages now as [humanYears,catYears,dogYears]

NOTES:

humanYears >= 1
humanYears are whole numbers only
Cat Years
15 cat years for first year
+9 cat years for second year
+4 cat years for each year after that
Dog Years
15 dog years for first year
+9 dog years for second year
+5 dog years for each year after that
*/


//My Solution
public class Dinglemouse
{

    public static int[] humanYearsCatYearsDogYears(int humanYears)
    {
        int dogYears = 15;
        int catYears = 15;
        int yearsAfterThat = humanYears - 2;

        if (humanYears > 2)
        {
            dogYears = dogYears + 9 + (5 * yearsAfterThat);
            catYears = catYears + 9 + (4 * yearsAfterThat);
            return new int[] { humanYears, catYears, dogYears };
        }
        else if (humanYears == 2)
        {
            dogYears = dogYears + 9;
            catYears = catYears + 9;
            return new int[] { humanYears, catYears, dogYears };
        }
        else
        {
            return new int[] { humanYears, catYears, dogYears };
        }
        return new int[] { 0, 0, 0 };
    }

}