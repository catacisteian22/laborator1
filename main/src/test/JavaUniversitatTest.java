package test;

import main.Problem1.JavaUniversitat;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class JavaUniversitatTest {

    @Test
    public void testFilterNichtAusreichendeNoten() {
        int[] noten = {70, 38, 42, 25, 30};
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(25);
        expected.add(30);

        Assert.assertEquals(expected, JavaUniversitat.filterNichtAusreichendeNoten(noten));
    }

    @Test
    public void testBerechneDurchschnitt() {
        int[] noten = {80, 90, 70, 60, 50};
        double expected = 70.0;

        Assert.assertEquals(expected, JavaUniversitat.berechneDurchschnitt(noten), 0.001);
    }

    @Test
    public void testRundeNotenAb() {
        int[] noten = {37, 42, 46, 50, 35};
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(37);
        expected.add(42);
        expected.add(46);
        expected.add(50);
        expected.add(35);

        Assert.assertEquals(expected, JavaUniversitat.rundeNotenAb(noten));
    }

    @Test
    public void testFindeMaxAbgerundeteNote() {
        int[] noten = {37, 42, 46, 50, 35};
        int expected = 50;

        Assert.assertEquals(expected, JavaUniversitat.findeMaxAbgerundeteNote(noten));
    }
}
