package main.Problem3;

public class Problem3 {

    static int sumArrays(int[] a, int[] b, int n, int m) {
        int[] sum = new int[n];

        int i = n - 1, j = m - 1, k = n - 1;

        int carry = 0, s = 0;
        //bevor wir der Anfang der Array erreichen, wir vergleichen nur fur das zweite array,
        //weil wir die size der arrays in Wrapper Funktion schon vergleichen
        while (j >= 0) {
            // die Summe dem zugehörigen Element fur beide Arrays
            s = a[i] + b[j] + carry;

            sum[k] = (s % 10);

            // finden carry fur naxhste sum
            carry = s / 10;

            k--;
            i--;
            j--;
        }
        //falls die Size der zweite Array is kleiner als der size der erste Array
        while (i >= 0) {
            //wir fugen den carry zu den ersten Array Elements
            s = a[i] + carry;
            sum[k] = (s % 10);
            carry = s / 10;

            i--;
            k--;
        }

        int ans = 0;


        if (carry == 1)
            ans = 10;

        // Array zu Zahl
        for (i = 0; i <= n - 1; i++) {
            ans += sum[i];
            ans *= 10;
        }

        return ans / 10;
    }

    // Wrapper Funktion
    public static int berechneSumme(int[] a, int[] b, int n, int m) {
        //machen das erste Array, welche hat die größte Anzahl von Elemente
        if (n >= m)
            return sumArrays(a, b, n, m);

        else
            return sumArrays(b, a, n, m);
    }

    public static int berechneDifferenz(int[] num1, int[] num2) {
        if (num1.length < num2.length) {
            return berechneDifferenz(num2, num1);
        }

        if (num1.length == num2.length) {
            // prüfen, wer grosser ist
            int idx = 0;
            while (idx < num1.length) {
                if (num1[idx] > num2[idx]) break;

                if (num1[idx] < num2[idx]) {
                    return berechneDifferenz(num2, num1);
                }

                idx++;
            }
        }

        int ptr1 = num1.length - 1;
        int ptr2 = num2.length - 1;
        while (ptr1 >= 0 && ptr2 >= 0) {
            int digit1 = num1[ptr1--];
            int digit2 = num2[ptr2--];

            int diff = 0;
            if (digit1 < digit2) {
                diff = digit1 + 10 - digit2;
                num1[ptr1] -= 1;
            } else {
                diff = digit1 - digit2;
            }

            num1[ptr1 + 1] = diff;
        }

        int result = 0;
        int last = 0;
        boolean zeroes = true;
        while (last < num1.length) {
            int num = num1[last++];
            if (num > 0) {
                zeroes = false;
            }

            if (!zeroes) {
                result = result * 10 + num;
            }
        }

        return result;
    }


//    public static int[] intToArray(int result){
//        String intAsString = Long.toString(result);
//
//        int[] intArray = new int[intAsString.length()];
//
//        for (int i = 0; i < intAsString.length(); i++) {
//            intArray[i] = Character.getNumericValue(intAsString.charAt(i));
//        }
//        return intArray;
//    }

}
