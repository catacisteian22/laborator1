package test;

import main.Problem2.Problem2;
import main.Problem3.Problem3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class Problem3Test {

    @Test
    public void testSummeZahlen() {
        int[] zahl1 = {1, 3, 0, 0, 0, 0, 0};
        int[] zahl2 = {8, 7, 0, 0, 0, 0, 0};
        int expected = 10000000;

        assertEquals(expected, Problem3.berechneSumme(zahl1, zahl2, zahl1.length, zahl2.length));
    }

    @Test
    public void testDiffZahlen() {
        int[] zahl1 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] zahl2 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        int expected = 290000000;

        assertEquals(expected, Problem3.berechneDifferenz(zahl1, zahl2));
    }

    @Test
    public void testEmptyListSumme() {
        int[] zahl1 = {};
        int[] zahl2 = {1, 9, 0, 0};

        assertThrows(IllegalArgumentException.class, () -> Problem3.berechneSumme(zahl1, zahl2, zahl1.length, zahl2.length));
    }

}