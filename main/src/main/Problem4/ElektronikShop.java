package main.Problem4;

public class ElektronikShop {

    public static int billigsteTastatur(int[] tastaturen) {
        int billigste = Integer.MAX_VALUE;

        for (int preis : tastaturen) {
            if (preis < billigste) {
                billigste = preis;
            }
        }

        return billigste;
    }

    public static int teuersteGegenstand(int[] tastaturen, int[] usbLaufwerke) {
        int teuersteTastatur = Integer.MIN_VALUE;
        int teuerstesUSB = Integer.MIN_VALUE;

        for (int preis : tastaturen) {
            if (preis > teuersteTastatur) {
                teuersteTastatur = preis;
            }
        }

        for (int preis : usbLaufwerke) {
            if (preis > teuerstesUSB) {
                teuerstesUSB = preis;
            }
        }

        return Math.max(teuersteTastatur, teuerstesUSB);
    }

    public static int teuersteUSB(int[] usbLaufwerke, int budget) {
        int teuerste = -1;

        for (int preis : usbLaufwerke) {
            if (preis <= budget && preis > teuerste) {
                teuerste = preis;
            }
        }

        return teuerste;
    }

    public static int gesamtkosten(int budget, int[] tastaturen, int[] usbLaufwerke) {
        int billigsteTastatur = billigsteTastatur(tastaturen);
        int teuerstesUSB = teuersteUSB(usbLaufwerke, budget);

        if (billigsteTastatur == Integer.MAX_VALUE || teuerstesUSB == -1) {
            return -1;
        }

        return billigsteTastatur + teuerstesUSB;
    }
}