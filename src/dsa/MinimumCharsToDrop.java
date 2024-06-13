package dsa;

public class MinimumCharsToDrop {

    public static void main(String[] args) {
        String input = "AAAAAAAAAAAB";
        int result = minCharsToDrop(input);
        System.out.println("Minimum number of characters to drop: " + result);
    }

    public static int minCharsToDrop(String s) {
        int n = s.length();
        int[] prefixA = new int[n];
        int[] suffixB = new int[n];

        // Calculate prefixA array
        if (s.charAt(0) == 'A') {
            prefixA[0] = 1;
        } else {
            prefixA[0] = 0;
        }
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == 'A') {
                prefixA[i] = prefixA[i - 1] + 1;
            } else {
                prefixA[i] = prefixA[i - 1];
            }
        }

        // Calculate suffixB array
        if (s.charAt(n - 1) == 'B') {
            suffixB[n - 1] = 1;
        } else {
            suffixB[n - 1] = 0;
        }
        for (int i = n - 2; i >= 0; i--) {
            if (s.charAt(i) == 'B') {
                suffixB[i] = suffixB[i + 1] + 1;
            } else {
                suffixB[i] = suffixB[i + 1];
            }
        }

        // Find the maximum length of valid AA*BB* subsequence
        int maxValidLength = 0;
        for (int i = 0; i < n - 1; i++) {
            maxValidLength = Math.max(maxValidLength, prefixA[i] + suffixB[i + 1]);
        }

        // Result is the number of characters to remove
        return n - maxValidLength;
    }
}
