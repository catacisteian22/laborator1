package test;

import main.Problem2.Problem2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

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

    @Test
    public void testFindeMinSumme() {
        int[] zahlenArray = {4, 8, 3, 10, 17};
        int expected = 25;

        assertEquals(expected, Problem2.findeMinSumme(zahlenArray));
    }

    @Test
    public void testEmptyList(){
        int[] zahlenArray = {};

        assertThrows(IllegalArgumentException.class, () -> Problem2.minimaleZahl(zahlenArray));
    }

    @Test
    public void testEmptyListMaxSumme() {
        int[] zahlenArray = {1};

        assertThrows(IllegalArgumentException.class, () -> Problem2.findeMaxSumme(zahlenArray));
    }
}