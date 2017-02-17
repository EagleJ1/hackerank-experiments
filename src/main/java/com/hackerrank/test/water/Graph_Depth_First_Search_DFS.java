package com.hackerrank.test.water;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * Created by txcakaloglu on 2/16/17.
 */
public class Graph_Depth_First_Search_DFS {

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

        public boolean hasPath(int fromNodeId, int toNodeId) {
            Node fromNode = getNode(fromNodeId);
            Node toNode = getNode(toNodeId);
            Set<Integer> visited = new HashSet<Integer>();
            return hasPath(fromNode, toNode, visited);
        }

        private boolean hasPath(Node fromNode, Node toNode, Set<Integer> visited) {
            if (visited.contains(fromNode)) {
                return false;
            }
            visited.add(fromNode.id);
            if (fromNode.equals(toNode)) {
                return true;
            }
            for (Node child : fromNode.adjacentNodeList) {
                if (hasPath(child, toNode, visited)) {
                    return true;
                }
            }
            return false;

        }

    }


}
