package test;

import main.Problem2.Problem2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem2Test {

    @Test
    public void testMaximaleZahl() {
        int[] zahlenArray = {12, 39, 45, 5, 59, 14};
        int expected = 59;

        assertEquals(expected, Problem2.maximaleZahl(zahlenArray));
    }

    @Test
    public void testMinimaleZahl() {
        int[] zahlenArray = {12, 39, 45, 5, 59, 14};
        int expected = 5;

        assertEquals(expected, Problem2.minimaleZahl(zahlenArray));
    }

    @Test
    public void testFindeMaxSumme() {
        int[] zahlenArray = {4, 8, 3, 10, 17};
        int expected = 39;

        assertEquals(expected, Problem2.findeMaxSumme(zahlenArray));
    }
}