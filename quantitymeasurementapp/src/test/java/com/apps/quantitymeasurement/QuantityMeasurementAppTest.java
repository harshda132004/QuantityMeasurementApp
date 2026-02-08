package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.apps.quantitymeasurement.QuantityMeasurementApp.Feet;
import com.apps.quantitymeasurement.QuantityMeasurementApp.Inches;

public class QuantityMeasurementAppTest {

    // -------- FEET TEST CASES --------

    @Test
    public void testFeetEquality_SameValue() {
        Feet f1 = new Feet(5.0);
        Feet f2 = new Feet(5.0);
        assertEquals(f1, f2);
    }

    @Test
    public void testFeetEquality_DifferentValue() {
        Feet f1 = new Feet(5.0);
        Feet f2 = new Feet(6.0);
        assertNotEquals(f1, f2);
    }

    @Test
    public void testFeetEquality_NullComparison() {
        Feet f1 = new Feet(5.0);
        assertNotEquals(f1, null);
    }

    @Test
    public void testFeetEquality_DifferentClass() {
        Feet f1 = new Feet(5.0);
        Inches i1 = new Inches(60.0);
        assertNotEquals(f1, i1);
    }

    @Test
    public void testFeetEquality_SameReference() {
        Feet f1 = new Feet(5.0);
        Feet f2 = f1;
        assertEquals(f1, f2);
    }

    // -------- INCHES TEST CASES --------

    @Test
    public void testInchesEquality_SameValue() {
        Inches i1 = new Inches(10.0);
        Inches i2 = new Inches(10.0);
        assertEquals(i1, i2);
    }

    @Test
    public void testInchesEquality_DifferentValue() {
        Inches i1 = new Inches(10.0);
        Inches i2 = new Inches(12.0);
        assertNotEquals(i1, i2);
    }

    @Test
    public void testInchesEquality_NullComparison() {
        Inches i1 = new Inches(10.0);
        assertNotEquals(i1, null);
    }

    @Test
    public void testInchesEquality_DifferentClass() {
        Inches i1 = new Inches(10.0);
        Feet f1 = new Feet(1.0);
        assertNotEquals(i1, f1);
    }

    @Test
    public void testInchesEquality_SameReference() {
        Inches i1 = new Inches(10.0);
        Inches i2 = i1;
        assertEquals(i1, i2);
    }
}
