package com.hackerrank.test.tutorial;

/**
 * Created by jackalhan on 2/4/17.
 */
public class _Binary_Search_Tree_HackerRank {

    public static class Node {
        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;

        }

        public void insert(int newData) {
            if (newData <= data) {
                if (left == null) {
                    left = new Node(newData);
                } else {
                    left.insert(newData);
                }
            } else {
                if (right == null) {
                    right = new Node(data);
                } else {
                    right.insert(data);
                }
            }
        }

        public boolean contains(int value) {
            if (value == data) {
                return true;
            } else if (value < data) {
                if (left == null) {
                    return false;
                } else {
                    return left.contains(value);
                }
            } else {
                if (right == null) {
                    return false;
                } else {
                    return right.contains(value);
                }
            }
        }

        public void printInOrder() {
            if (left != null) {
                left.printInOrder(); // my left child
            }
            System.out.println(data); // myself0
            if (right != null) {
                right.printInOrder(); // my right child.
            }
        }
    }
}
