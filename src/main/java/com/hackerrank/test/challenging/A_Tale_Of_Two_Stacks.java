package com.hackerrank.test.challenging;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by jackalhan on 2/12/17.
 */
public class A_Tale_Of_Two_Stacks {

    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();

        // ADD A NEW ELEMENT TO THE END OF THE QUEUE
        public void enqueue(T value) { // Push onto newest stack
            stackNewestOnTop.push(value);
        }

        public T peek() {
            regulateStacks();
            return stackOldestOnTop.peek();
        }

        // REMOVE THE ELEMENT FROM THE FRONT OF THE QUEUE
        public T dequeue() {
            regulateStacks();
            return stackOldestOnTop.pop();
        }

        void regulateStacks(){
            if (stackOldestOnTop.empty()) {
                while (!stackNewestOnTop.isEmpty()) {
                    stackOldestOnTop.push(stackNewestOnTop.pop());
                }
            }
        }
    }

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue //add
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue //remove from the first
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}
