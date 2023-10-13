package test;

import main.Problem4.ElektronikShop;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElektronikShopTest {

    @Test
    public void testBilligsteTastatur() {
        int[] tastaturPreise = {40, 35, 70, 15, 45};
        int expected = 15;

        assertEquals(expected, ElektronikShop.billigsteTastatur(tastaturPreise));
    }

    @Test
    public void testTeuersteGegenstand() {
        int[] tastaturPreise = {15, 20, 10, 35};
        int[] usbPreise = {20, 15, 40, 15};
        int expected = 40;

        assertEquals(expected, ElektronikShop.teuersteGegenstand(tastaturPreise, usbPreise));
    }

    @Test
    public void testTeuersteUSB() {
        int[] preise = {15, 45, 20};
        int budget = 30;
        int expected = 20;

        assertEquals(expected, ElektronikShop.teuersteUSB(preise, budget));
    }

    @Test
    public void testGesamtKostenGenug(){
        int buget =60;
        int[] tastaturen = {40, 50, 60};
        int[] usbLaufwerke = {8, 12};
        int expected = 52;

        assertEquals(expected, ElektronikShop.gesamtkosten(buget, tastaturen, usbLaufwerke));
    }

    @Test
    public void testGesamtKostenNichtGenug(){
        int buget = 60;
        int[] tastaturen = {40, 50, 60};
        int[] usbLaufwerke = {21, 35};
        int expected = -1;

        assertEquals(expected, ElektronikShop.gesamtkosten(buget, tastaturen, usbLaufwerke));
    }
}