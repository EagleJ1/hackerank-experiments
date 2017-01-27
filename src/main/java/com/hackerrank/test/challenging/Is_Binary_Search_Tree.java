package com.hackerrank.test.challenging;

/**
 * Created by jackalhan on 1/26/17.
 */
public class Is_Binary_Search_Tree {
    static class Node {
        int data;
        Node left;
        Node right;
        public Node(int item)
        {
            data = item;
            left = right = null;
        }
    }

    static boolean checkBST(Node root) {
        return checkNode(root, Integer.MIN_VALUE, Integer.MAX_VALUE); // start with an infinite range
    }

    static boolean checkNode(Node node, int min, int max) {
        return node == null
                || node.data > min && node.data < max // validate if the value is within the allowed range
                && checkNode(node.left, min, node.data) // check the left child decreasing the end of the allowed range to the current value
                && checkNode(node.right, node.data, max); // check the right child increasing the beginning of the range to the current value
    }

    public static void main(String args[])
    {

        Node tree = new Node(4);
        tree.left = new Node(2);
        tree.right = new Node(5);
        tree.left.left = new Node(1);
        tree.left.right = new Node(3);

        if (checkBST(tree))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }
}
