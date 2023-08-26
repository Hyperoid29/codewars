
/*
You get an array of numbers, return the sum of all of the positives ones.

Example [1,-4,7,12] => 1 + 7 + 12 = 20

Note: if there is nothing to sum, the sum is default to 0.
 */

//My Solution

public class Sum-of-Positive{

    public static int sum(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];

            } else {
                if (i < arr.length - 1) {
                    arr[i] = arr[i + 1];
                } else {
                    arr[i] = 0;
                }
            }

        }
        return sum;
    }

}
