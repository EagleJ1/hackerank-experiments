package com.hackerrank.test.water;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by jackalhan on 1/27/17.
 */
public class Stacks_Balanced_Brackets {
    //   (, ), {, }, [, or ].
    // {[()]}
    public static boolean isBalanced(String expression) {
        char[] c = expression.toCharArray();
        Stack<Character> characters = new Stack<Character>();
        for (char ch : c) {
            if (ch == '}' || ch == ']' || ch == ')') {
                if (characters.empty())
                    return false;
                char tempChar = characters.pop();
                if ((tempChar == '[' && ch != ']')
                        ||
                        (tempChar == '{' && ch != '}')
                        ||
                        (tempChar == '(' && ch != ')'))
                    return false;
            } else {
                characters.push(ch);
            }
        }
        if (characters.empty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println((isBalanced(expression)) ? "YES" : "NO");
        }
    }
}
