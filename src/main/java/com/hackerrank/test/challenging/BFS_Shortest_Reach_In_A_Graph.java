package com.hackerrank.test.challenging;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by jackalhan on 2/14/17.
 */
public class BFS_Shortest_Reach_In_A_Graph {
    public static class Graph {

        private Node[] nodes;
        private int counter;

        public Graph(int size) {
            nodes = new Node[size];
            counter = 0;
        }

        public void addEdge(int first, int second) {
            Node node = new Node(first, second);
            nodes[counter] = node;
            counter++;
        }

        public int[] shortestReach(int startId) { // 0 indexed
            Arrays.sort(nodes);
            int [] path = new int[nodes.length];
           return path;
        }
    }

    public static class Node implements Comparable {
        private int id;
        private int connectedId;
        private int weight;

        public Node(int newNodeId, int newConnectedId) {
            this.id = newNodeId;
            this.connectedId = newConnectedId;
            this.weight = (newConnectedId != 0) ? 6 : -1;
        }

        private int getNodeId() {
            return id;
        }

        private int getNodeConnectedId() {
            return connectedId;
        }

        private int getWeight() {
            return weight;
        }

        @Override
        public int compareTo(Object o) {
            Node node = (Node) o;
            return this.id - node.id;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int queries = scanner.nextInt();

        for (int t = 0; t < queries; t++) {

            // Create a graph of size n where each edge weight is 6:
            Graph graph = new Graph(scanner.nextInt());
            int m = scanner.nextInt();

            // read and set edges
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt() - 1;
                int v = scanner.nextInt() - 1;

                // add each edge to the graph
                graph.addEdge(u, v);
            }

            // Find shortest reach from node s
            int startId = scanner.nextInt() - 1;
            int[] distances = graph.shortestReach(startId);

            for (int i = 0; i < distances.length; i++) {
                if (i != startId) {
                    System.out.print(distances[i]);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
