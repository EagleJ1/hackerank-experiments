package com.hackerrank.test.tutorial;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * Created by txcakaloglu on 2/16/17.
 */
public class _Graph_Breadth_First_Search_BFS {

    public class Node {
        private int id;
        LinkedList<Node> adjacentNodeList = new LinkedList<Node>();

        public Node(int id) {
            this.id = id;
        }

        public String toString() {
            String s = "Node ID : " + this.id + "\n";
            for (Node node : adjacentNodeList) {
                s = s + "{" + node + "}";
            }
            return s;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Node node = (Node) o;

            return id == node.id;

        }

        @Override
        public int hashCode() {
            return id;
        }
    }

    public class Graph {
        HashMap<Integer, Node> elements = new HashMap<Integer, Node>();

        private Node getNode(int id) {
            return elements.get(id);
        }

        public void addEdge(int fromNode, int toNode) {
            Node from = new Node(fromNode);
            Node to = new Node(toNode);
            from.adjacentNodeList.add(to);
        }

        public String toString() {
            String s = "";
            for (int keys : elements.keySet()) {
                s = s + elements.get(keys).toString() + "\n";
            }
            return s;
        }

        public void displayAll() {
            System.out.println(toString());
        }

        public boolean hasPathWithDFS(int fromNode, int toNode) {
            Node from = getNode(fromNode);
            Node to = getNode(toNode);
            HashSet<Integer> visited = new HashSet<Integer>();
            return hasPathWithDFS(from, to, visited);
        }

        private boolean hasPathWithDFS(Node fromNode, Node toNode, Set<Integer> visited) {
            if (visited.contains(fromNode.id)) {
                return false;
            }
            visited.add(fromNode.id);
            if (fromNode.equals(toNode)) {
                return true;
            }
            for (Node myNeigbour : fromNode.adjacentNodeList) {
                if (hasPathWithDFS(myNeigbour, toNode, visited)) {
                    return true;
                }
            }
            return false;

        }
/*
        public boolean hasPath(int fromNode, int toNode) {

        }*/

    }


}
