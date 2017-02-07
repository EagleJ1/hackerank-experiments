package com.hackerrank.test.tutorial;

/**
 * Created by jackalhan on 2/3/17.
 */
public class _Queue {
    private static class Node {
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    private Node head; // remove from the head
    private Node tail; // add things here. Tail is the beginning of queue. Like first place

    public boolean isEmpty() {
        return head == null; // if queue is empty, otherwise not.
    }

    public int peek() {
        return head.data;
    }

    public void add(int data) {
        // add the tail
        Node node = new Node(data);
        if (tail != null) {
            tail.next = node;
        }
        tail = node; //update the tail
        if (head == null) {
            head = node;
        }

    }

    public int remove() {
        int data = head.data;
        head = head.next;
        return 0;
    }

}
