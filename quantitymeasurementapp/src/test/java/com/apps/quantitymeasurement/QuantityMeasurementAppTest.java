package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.apps.quantitymeasurement.QuantityMeasurementApp.Feet;

/**
 * JUnit test cases for UC1: Feet measurement equality
 */
public class QuantityMeasurementAppTest {

    // 1. Same value equality
    @Test
    public void testFeetEquality_SameValue() {
        Feet feet1 = new Feet(1.0);
        Feet feet2 = new Feet(1.0);

        assertTrue(feet1.equals(feet2));
    }

    // 2. Different value inequality
    @Test
    public void testFeetEquality_DifferentValue() {
        Feet feet1 = new Feet(1.0);
        Feet feet2 = new Feet(2.0);

        assertFalse(feet1.equals(feet2));
    }

    // 3. Null comparison
    @Test
    public void testFeetEquality_NullComparison() {
        Feet feet = new Feet(1.0);

        assertFalse(feet.equals(null));
    }

    // 4. Non-numeric / different class comparison
    @Test
    public void testFeetEquality_DifferentClass() {
        Feet feet = new Feet(1.0);
        Object obj = "1.0";

        assertFalse(feet.equals(obj));
    }

    // 5. Same reference comparison
    @Test
    public void testFeetEquality_SameReference() {
        Feet feet = new Feet(1.0);

        assertTrue(feet.equals(feet));
    }
}
