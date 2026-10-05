/*
 * GroceryCalculator.java
 * Calculates the average weekly and monthly grocery bill for a family
 * of four, with and without a coupon discount.
 *
 * Author: Logan Harris
 * Date:   October 4, 2026
 */

import java.util.Scanner;

public class GroceryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ---- Read the coupon rate and validate it ----
        System.out.print("Enter the coupon amount as a decimal (example, .10): ");
        double couponRate = input.nextDouble();

        // A valid coupon is above 0 and no more than 1.00, which is 100%.
        // Anything outside that range is reset to the 10% default.
        if (couponRate > 1.0 || couponRate <= 0.0) {
            couponRate = 0.10;
            System.out.println("Invalid coupon amount. Using default of 10%.");
        }

        // ---- Read the four weekly grocery bills ----
        System.out.print("Enter the grocery bill for week 1: ");
        double week1 = input.nextDouble();
        System.out.print("Enter the grocery bill for week 2: ");
        double week2 = input.nextDouble();
        System.out.print("Enter the grocery bill for week 3: ");
        double week3 = input.nextDouble();
        System.out.print("Enter the grocery bill for week 4: ");
        double week4 = input.nextDouble();

        // ---- Totals without the coupon ----
        double monthlyTotal  = week1 + week2 + week3 + week4;
        double weeklyAverage = monthlyTotal / 4;

        // ---- Totals with the coupon ----
        // Paying (1 - couponRate) of the original leaves the discount off.
        double monthlyWithCoupon = monthlyTotal * (1 - couponRate);
        double weeklyWithCoupon  = monthlyWithCoupon / 4;
        double monthlySavings    = monthlyTotal - monthlyWithCoupon;

        // ---- Display the results to two decimal places ----
        System.out.println();
        System.out.println("===== Grocery Summary for a Family of Four =====");
        System.out.printf("Coupon applied: %.0f%%%n", couponRate * 100);

        System.out.println();
        System.out.println("--- Without Coupon ---");
        System.out.printf("Monthly total:  $%.2f%n", monthlyTotal);
        System.out.printf("Weekly average: $%.2f%n", weeklyAverage);

        System.out.println();
        System.out.println("--- With Coupon ---");
        System.out.printf("Monthly total:  $%.2f%n", monthlyWithCoupon);
        System.out.printf("Weekly average: $%.2f%n", weeklyWithCoupon);

        System.out.println();
        System.out.printf("Total saved this month: $%.2f%n", monthlySavings);

        input.close();
    }
}
