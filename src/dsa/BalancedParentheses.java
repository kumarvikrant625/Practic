package dsa;

import java.util.Stack;

public class BalancedParentheses {

    public static String validateParenthesis(String s) {
        char[] chars = s.toCharArray();
        int balance = 0;  // Track opening minus closing parentheses
        StringBuilder result = new StringBuilder();

        for (char c : chars) {
            if (c == '(') {
                balance++;
                result.append(c);
            } else if (c == ')') {
                if (balance > 0) {
                    balance--;
                    result.append(c);
                }
            }
        }
      //  System.out.println(balance +"||" + result.toString());
        return balance == 0 ? result.toString() : result.substring(balance).toString();  // Return balanced string or empty string

    }

    public static void main(String[] args) {
        String[] testStrings = {"((()", "()(()))))", "(()", ")((()())", "()((())"};
        for (String test : testStrings) {
            String result = validateParenthesis(test);
            System.out.println("Input: " + test + ", Output: " + result);
        }
    }
}
