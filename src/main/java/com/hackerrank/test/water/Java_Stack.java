package com.hackerrank.test.water;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by jackalhan on 2/8/17.
 */
public class Java_Stack {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = null;
        while (sc.hasNext()) {
            String input = sc.next();
            stack = new Stack<Character>();
            char[] elementsInLine = input.toCharArray();
            boolean isInCorrectOrder = true;
            for (char ch : elementsInLine) {
                char elementAtTop;
                if (ch == '{' || ch == '[' || ch == '(') {
                    stack.push(ch);
                } else {
                    if (!stack.isEmpty()) {
                        elementAtTop = stack.peek();
                    } else {
                        isInCorrectOrder = false;
                        break;
                    }

                    if ((elementAtTop == '{' && ch != '}') ||
                            (elementAtTop == '[' && ch != ']') ||
                            (elementAtTop == '(' && ch != ')')
                            ) {
                        isInCorrectOrder = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (isInCorrectOrder)
                System.out.println((stack.isEmpty()) ? "true" : "false");
            else
                System.out.println("false");

        }

    }
}
