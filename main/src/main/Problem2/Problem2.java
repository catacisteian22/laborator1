package main.Problem2;

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

    public static int findeMaxSumme(int[] zahlenArray) {
        if (zahlenArray == null || zahlenArray.length < 2) {
            throw new IllegalArgumentException("Das Array muss mindestens zwei Elemente enthalten.");
        }

        int kleinste = minimaleZahl(zahlenArray);

        int[] neueArray = new int[zahlenArray.length - 1];

        for (int i = 0, k = 0; i < zahlenArray.length; i++) {
            if (zahlenArray[i] != kleinste) {
                neueArray[k] = zahlenArray[i];
                k++;
            }
        }
        return summedElementInArray(neueArray, neueArray.length);
    }

    public static int findeMinSumme(int[] zahlenArray) {
        if (zahlenArray == null || zahlenArray.length < 2) {
            throw new IllegalArgumentException("Das Array muss mindestens zwei Elemente enthalten.");
        }

        int größte = maximaleZahl(zahlenArray);

        int[] neueArray = new int[zahlenArray.length - 1];

        for (int i = 0, k = 0; i < zahlenArray.length; i++) {
            if (zahlenArray[i] != größte) {
                neueArray[k] = zahlenArray[i];
                k++;
            }
        }
        return summedElementInArray(neueArray, neueArray.length);
    }

    private static int summedElementInArray(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        return summedElementInArray(arr, n - 1) + arr[n - 1];
    }
}