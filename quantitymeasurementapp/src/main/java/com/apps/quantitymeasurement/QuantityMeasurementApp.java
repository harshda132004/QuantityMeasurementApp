package com.apps.quantitymeasurement;

import java.util.Scanner;

/**
 * QuantityMeasurementApp - UC1: Feet measurement equality
 */
public class QuantityMeasurementApp {

    // Inner class representing Feet
    public static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        /**
         * Equality check for Feet objects
         */
        @Override
        public boolean equals(Object obj) {

            // 1. Reference check
            if (this == obj)
                return true;

            // 2. Null check
            if (obj == null)
                return false;

            // 3. Type check
            if (this.getClass() != obj.getClass())
                return false;

            // 4. Value comparison
            Feet other = (Feet) obj;
            return Double.compare(this.value, other.value) == 0;
        }
    }

    // Main method to demonstrate Feet equality check
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first value in feet: ");
        double firstValue = scanner.nextDouble();

        System.out.print("Enter second value in feet: ");
        double secondValue = scanner.nextDouble();

        Feet feet1 = new Feet(firstValue);
        Feet feet2 = new Feet(secondValue);

        boolean result = feet1.equals(feet2);

        System.out.println("Equal (" + result + ")");

        scanner.close();
    }
}
