package com.hackerrank.test.tutorial;

import java.util.Scanner;

/**
 * Created by jackalhan on 1/16/17.
 */
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class Day15_LinkedList {

    public static Node insert(Node head, int data) {

        if (head == null) {
            head = new Node(data);
        } else {
            Node node = head;
            while (node.next != null)
            {
                node = node.next;
            }
            node.next = new Node(data);
        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}
