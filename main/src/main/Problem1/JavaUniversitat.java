package main.Problem1;

import java.util.ArrayList;

public class JavaUniversitat {

    // Methode, um nicht ausreichende Noten zu filtern
    public static ArrayList<Integer> filterNichtAusreichendeNoten(int[] noten) {
        ArrayList<Integer> nichtAusreichendeNoten = new ArrayList<>();
        for (int note : noten) {
            if (note < 40) {
                nichtAusreichendeNoten.add(note);
            }
        }
        return nichtAusreichendeNoten;
    }

    // Methode, um den Durchschnitt der Noten zu berechnen
    public static double berechneDurchschnitt(int[] noten) {
        int summe = 0;
        for (int note : noten) {
            summe += note;
        }
        return (double) summe / noten.length;
    }

    // Methode, um Noten abzurunden
    public static ArrayList<Integer> rundeNotenAb(int[] noten) {
        ArrayList<Integer> abgerundeteNoten = new ArrayList<>();
        for (int note : noten) {
            if (note >= 38 && note % 5 >= 3) {
                abgerundeteNoten.add((note / 5 + 1) * 5);
            } else {
                abgerundeteNoten.add(note);
            }
        }
        return abgerundeteNoten;
    }

    // Methode, um die maximale abgerundete Note zu finden
    public static int findeMaxAbgerundeteNote(int[] noten) {
        int maxAbgerundeteNote = 0;
        for (int note : noten) {
            if (note >= 38 && note % 5 >= 3) {
                int abgerundeteNote = (note / 5 + 1) * 5;
                if (abgerundeteNote > maxAbgerundeteNote) {
                    maxAbgerundeteNote = abgerundeteNote;
                }
            }
        }
        return maxAbgerundeteNote;
    }
    public static void main(String[] args) {
        int[] noten = {84, 29, 38, 37, 63};

        ArrayList<Integer> nichtAusreichendeNoten = JavaUniversitat.filterNichtAusreichendeNoten(noten);
        System.out.println("Nicht ausreichende Noten: " + nichtAusreichendeNoten);

        double durchschnitt = JavaUniversitat.berechneDurchschnitt(noten);
        System.out.println("Durchschnitt: " + durchschnitt);

        ArrayList<Integer> abgerundeteNoten = JavaUniversitat.rundeNotenAb(noten);
        System.out.println("Abgerundete Noten: " + abgerundeteNoten);

        int maxAbgerundeteNote = JavaUniversitat.findeMaxAbgerundeteNote(noten);
        System.out.println("Maximale abgerundete Note: " + maxAbgerundeteNote);
    }
}