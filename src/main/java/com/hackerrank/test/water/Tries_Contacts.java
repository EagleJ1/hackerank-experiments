package com.hackerrank.test.water;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by jackalhan on 1/26/17.
 */
public class Tries_Contacts {

    public static class Node {
        //private static int NUMBER_OF_CHARS = 26;
        Node[] branch = new Node['z' - 'a' + 1];
        int nodeSize = 0;

        private static int getCharIndex(char c) {
            return c - 'a';
        }

        private Node getNode(char c) {
            return branch[getCharIndex(c)];
        }

        private void setNode(char c, Node node) {
            branch[getCharIndex(c)] = node;
        }

        public void add(String s) {
            add(s, 0);
        }

        private void add(String s, int index) {
            nodeSize++;
            if (index == s.length()) return;
            char current = s.charAt(index);
            int charCodeInTrie = getCharIndex(current);
            Node childNode = getNode(current);
            if (childNode == null) {
                childNode = new Node();
                setNode(current, childNode);
            }
            childNode.add(s, index + 1);
        }

        public int find(String s) {
            return findCount(s, 0);
        }
        private int findCount(String s, int index) {
            if (index == s.length())
                return nodeSize;
            Node childNode = getNode(s.charAt(index));
            if (childNode == null)
                return 0;
            else
                return childNode.findCount(s, index + 1);

        }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Node node = new Node();
        for (int a0 = 0; a0 < n; a0++) {
            String op = in.next();
            String contact = in.next();
            if (op.equals("add"))
                node.add(contact);
            else if (op.equals("find"))
                System.out.println(node.find(contact));

        }
        in.close();
    }


}
