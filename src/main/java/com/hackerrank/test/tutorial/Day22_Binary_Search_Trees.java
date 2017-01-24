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

        int heightleft = 0,
                heightright = 0;
        Node current = root;
        if (current.right != null) {
            heightright = 1 + getHeight(current.right);
        }
        if (current.left != null) {
            heightleft = 1 + getHeight(current.left);
        }

        return Math.max(heightleft, heightright);
    }

}
