import java.util.*;

// Gives exact ans n decimal 
//https://leetcode.com/problems/sqrtx/

public class SquareRoot {
    public double mySqrtWithDecimal(int x, int decimalPlaces) {
        if (x == 0) return 0.0;

        double start = 0.0;
        double end = x;
        double precision = 1.0 / Math.pow(10, decimalPlaces);
        System.out.println("Precision: " +precision);


        while (true) {
            double mid = start + (end - start) / 2;
            double square = mid * mid;

            if (Math.abs(square - x) <= precision) {
                return mid;
            } else if (square < x) {
                start = mid;
            } else {
                end = mid;
            }
        }
    }

    public static void main(String[] args) {
        SquareRoot SquareRoot = new SquareRoot();
        int x = 8; // Change this to the integer for which you want to find the square root
        int decimalPlaces = 4; // Change this to the desired number of decimal places

        double result = SquareRoot.mySqrtWithDecimal(x, decimalPlaces);
        System.out.println("Square root of " + x + " with " + decimalPlaces + " decimal places: " + result);
    }
}
