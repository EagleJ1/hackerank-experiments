package com.hackerrank.test.water;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by jackalhan on 2/16/17.
 */
public class Graph_Breadth_First_Search_BFS {

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

        public Graph() {

        }

        public Node getNode(int id) {
            return elements.get(id);
        }

        public String toString() {
            String s = "";
            for (int keys : elements.keySet()) {
                s = s + elements.get(keys).toString() + "\n";
            }
            return s;
        }

        public void addEdge(int fromNodeId, int toNodeId) {
            Node from = new Node(fromNodeId);
            Node to = new Node(toNodeId);
            from.adjacentNodeList.add(to);
        }

        public void displayAll() {
            System.out.println(this.toString());
        }

        public boolean hasPath(int fromNodeId, int toNodeId) {
            return hasPath(getNode(fromNodeId), getNode(toNodeId));
        }

        private boolean hasPath(Node fromNode, Node toNode) {
            Queue<Node> toBeVisitedNodes = new LinkedList<Node>();
            HashSet<Integer> visitedNodes = new HashSet<Integer>();
            toBeVisitedNodes.offer(fromNode);
            while (!toBeVisitedNodes.isEmpty()) {
                Node focusNode = toBeVisitedNodes.poll();
                if (focusNode == toNode) {
                    return true;
                }
                if (visitedNodes.equals(focusNode)) {
                    continue;
                }
                visitedNodes.add(focusNode.id);
                for (Node child : focusNode.adjacentNodeList) {
                    toBeVisitedNodes.offer(child);
                }
            }
            return false;


        }

    }


}
