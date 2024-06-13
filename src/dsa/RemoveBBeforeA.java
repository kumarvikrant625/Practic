package dsa;

public class RemoveBBeforeA {


    public static int minRemoval(String str) {
        int removals = 0;
        char prev = ' ';

        for (char ch : str.toCharArray()) {
            if (ch == 'B' && (prev == 'B' || prev == ' ')) {
                removals++;
            } else {
                prev = ch;
            }
        }

        return removals;
    }

    public static void main(String[] args) {
        String[] inputs = {"BBBABBBBB", "AAAABBBBBA", "BBBBBB", "AAAAA", "AABBAAAABBB"};
        for (String input : inputs) {
            int minToRemove = minRemoval(input);
            System.out.println("Input: " + input + ", Output: " + minToRemove);
        }
    }
}
