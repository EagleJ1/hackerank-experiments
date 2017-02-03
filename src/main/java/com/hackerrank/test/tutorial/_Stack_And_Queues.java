package com.hackerrank.test.tutorial;

/**
 * Created by txcakaloglu on 2/3/17.
 */
public class _Stack_And_Queues {
    private static class Node {
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    private static class Queue {
        private Node head; // remove elements from the queue
        private Node tail; // add elements to queue

        private boolean isEmpty() {
            return head == null;
        }

        private int peek() {
            return head.data;
        }

        private void add(int data) {
            Node node = new Node(data);
            if (tail != null) {
                tail.next = node;
            }
            tail = node;
            if (head == null) {
                head = node;
            }
        }

        private int rmeove() {
            int data = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return data;
        }
    }

    private static class Stack {
        private Node top;

        public boolean isEmpty() {
            return top == null;
        }

        public int peek() {
            return top.data;
        }

        public void push(int data) {
            Node node = new Node(data);
            if (top != null) {
                node.next = top;
            }
            top = node;
        }

        public int pop() {
            int data = -1;
            if (top.next != null) {
                data = top.data;
                top = top.next;
            }
            return data;
        }
    }
}
