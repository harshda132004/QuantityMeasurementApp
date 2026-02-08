package com.apps.quantitymeasurement;

import java.util.Scanner;

/**
 * QuantityMeasurementApp – UC2: Feet and Inches measurement equality
 */
public class QuantityMeasurementApp {

    // Inner class to represent Feet measurement
    public static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;

            if (obj == null || this.getClass() != obj.getClass())
                return false;

            Feet other = (Feet) obj;
            return Double.compare(this.value, other.value) == 0;
        }
    }

    // Inner class to represent Inches measurement
    public static class Inches {
        private final double value;

        public Inches(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;

            if (obj == null || this.getClass() != obj.getClass())
                return false;

            Inches other = (Inches) obj;
            return Double.compare(this.value, other.value) == 0;
        }
    }

    // Take user input and check Inches equality
    public static void demonstrateInchesEquality(Scanner sc) {
        System.out.print("Enter first value in inches: ");
        double v1 = sc.nextDouble();

        System.out.print("Enter second value in inches: ");
        double v2 = sc.nextDouble();

        Inches inch1 = new Inches(v1);
        Inches inch2 = new Inches(v2);

        boolean result = inch1.equals(inch2);

        System.out.println("Input: " + v1 + " inch and " + v2 + " inch");
        System.out.println("Output: Equal (" + result + ")");
        System.out.println();
    }

    // Take user input and check Feet equality
    public static void demonstrateFeetEquality(Scanner sc) {
        System.out.print("Enter first value in feet: ");
        double v1 = sc.nextDouble();

        System.out.print("Enter second value in feet: ");
        double v2 = sc.nextDouble();

        Feet feet1 = new Feet(v1);
        Feet feet2 = new Feet(v2);

        boolean result = feet1.equals(feet2);

        System.out.println("Input: " + v1 + " ft and " + v2 + " ft");
        System.out.println("Output: Equal (" + result + ")");
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        demonstrateInchesEquality(sc);
        demonstrateFeetEquality(sc);

        sc.close();
    }
}
