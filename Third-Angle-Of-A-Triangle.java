/*
You are given two interior angles (in degrees) of a triangle.

Write a function to return the 3rd.

Note: only positive integers will be tested.

https://en.wikipedia.org/wiki/Triangle
*/

//My Solution

public class ThirdAngle {
    public static int otherAngle(int angle1, int angle2) {
        int total = 180;

        return total - (angle1 + angle2);
    }
}
