package main.Problem4;

public class ElektronikShop {

    public static int billigsteTastatur(int[] tastaturen) {
        if (tastaturen.length == 0) {
            throw new IllegalArgumentException("The list is empty.");
        }
        int billigste = Integer.MAX_VALUE;

        for (int preis : tastaturen) {
            if (preis < billigste) {
                billigste = preis;
            }
        }

        return billigste;
    }

    public static int teuersteGegenstand(int[] tastaturen, int[] usbLaufwerke) {
        if (tastaturen.length == 0 || usbLaufwerke.length == 0) {
            throw new IllegalArgumentException("The list is empty.");
        }
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
        if (usbLaufwerke.length == 0) {
            throw new IllegalArgumentException("The list is empty.");
        }
        int teuerste = -1;

        for (int preis : usbLaufwerke) {
            if (preis <= budget && preis > teuerste) {
                teuerste = preis;
            }
        }

        return teuerste;
    }

    public static int gesamtkosten(int budget, int[] tastaturen, int[] usbLaufwerke) {
        if (tastaturen.length == 0 || usbLaufwerke.length == 0) {
            throw new IllegalArgumentException("The list is empty.");
        }
        int billigsteTastatur = billigsteTastatur(tastaturen);
        int teuerstesUSB = teuersteUSB(usbLaufwerke, budget);

        if ((billigsteTastatur + teuerstesUSB) >= budget) {
            return -1;
        }

        return billigsteTastatur + teuerstesUSB;
    }
}
