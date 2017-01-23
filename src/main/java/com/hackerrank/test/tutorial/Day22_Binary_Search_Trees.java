package com.hackerrank.test.tutorial;

import java.util.Scanner;

/**
 * Created by jackalhan on 1/21/17.
 */
public class Day22_Binary_Search_Trees {
    static class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }

    private static int getHeight(Node root) {

        Node parent = root;
        Node current = root;

        while (true) {
            parent = current;
            if (current.data > id) {
                current = current.left;
            } else {
                current = current.right;
            }
            if (current == null) {
                return false;
            }
        }
        while ((root.left == null) && (root.right == null)) {
            if (root.left != null) {

            }
        }
    }

}
