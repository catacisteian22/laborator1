package main.Problem2;

import java.util.List;

public class Problem2 {

    public static int maximaleZahl(int[] zahlenArray) {
        int größte = Integer.MIN_VALUE;

        for (int zahl : zahlenArray) {
            if (zahl > größte) {
                größte = zahl;
            }
        }
        return größte;
    }

    public static int minimaleZahl(int[] zahlenArray) {
        int kleinste = Integer.MAX_VALUE;

        for (int zahl : zahlenArray) {
            if (zahl < kleinste) {
                kleinste = zahl;
            }
        }
        return kleinste;
    }
    /*3. Finden Sie die maximale Summe von n-1 Zahlen.
    z.B. [4, 8, 3, 10, 17] => 4 + 8 + 10 + 17 = 39
    4. Finden Sie die minimale Summe von n-1 Zahlen.
    z.B. [4, 8, 3, 10, 17] => 4 + 8 + 3 + 10 = 25*/

    public static int findeMaxSumme(int[] zahlenArray) {
        if (zahlenArray == null || zahlenArray.length < 2) {
            throw new IllegalArgumentException("Das Array muss mindestens zwei Elemente enthalten.");
        }

        int kleinste = minimaleZahl(zahlenArray);

        int[] neueArray = new int[zahlenArray.length - 1];
        int j = kleinste;

        for (int i = 0, k = 0; i < zahlenArray.length; i++) {
            if (zahlenArray[i] != j) {
                neueArray[k] = zahlenArray[i];
                k++;
            }
        }
        int maxSumme = summeElementeInArray(neueArray, neueArray.length);
        return maxSumme;
    }

    public static int findeMinSumme(int[] zahlenArray) {
        if (zahlenArray == null || zahlenArray.length < 2) {
            throw new IllegalArgumentException("Das Array muss mindestens zwei Elemente enthalten.");
        }

        int größte = maximaleZahl(zahlenArray);

        int[] neueArray = new int[zahlenArray.length - 1];
        int j = größte;

        for (int i = 0, k = 0; i < zahlenArray.length; i++) {
            if (zahlenArray[i] != j) {
                neueArray[k] = zahlenArray[i];
                k++;
            }
        }
        int minSumme = summeElementeInArray(neueArray, neueArray.length);
        return minSumme;
    }

    private static int summeElementeInArray(int[] arr, int n) {
        // base or terminating condition
        if (n <= 0) {
            return 0;
        }
        // Calling method recursively
        return summeElementeInArray(arr, n - 1) + arr[n - 1];
    }
}