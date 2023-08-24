
/*
DESCRIPTION:
There was a test in your class and you passed it. Congratulations!
But you're an ambitious person. You want to know if you're better than the average student in your class.

You receive an array with your peers' test scores. Now calculate the average and compare your score!

Return True if you're better, else False!

Note:
Your points are not included in the array of your class's points. For calculating the average point you may add your point to the given array!
*/

//My Solution
class Kata {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {

        int totalClassPoints = 0;
        int count = 0;
        int totalAverage = 0;

        for (int i = 0; i < classPoints.length; i++) {
            totalClassPoints += classPoints[i];
            count++;
        }

        totalAverage = totalClassPoints / count;

        if (totalAverage > yourPoints) {
            return false;
        } else {
            return true;
        }

    }
}
