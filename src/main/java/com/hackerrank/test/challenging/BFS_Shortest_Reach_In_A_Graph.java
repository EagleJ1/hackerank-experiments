package com.hackerrank.test.challenging;

import java.util.*;

/**
 * Created by jackalhan on 2/14/17.
 */
//BFS is designed for finding the shortest path.
//BFS need some queue to track the next process

public class BFS_Shortest_Reach_In_A_Graph {


    public static class Graph {

        List<List<Integer>> adjLst;
        int size;
        private static int EDGE_DISTANCE = 6;

        public Graph(int size) {
            adjLst = new ArrayList<>();
            this.size = size;
            while(size-- > 0)//Initialize the adjancency list.
                adjLst.add(new ArrayList<Integer>());
        }

        public void addEdge(int first, int second) {
            // For undirected graph, you gotta add edges from both sides.
            adjLst.get(first).add(second);
            adjLst.get(second).add(first);
        }

        public int[] shortestReach(int startId) { // 0 indexed

            // Special for this problem
            int[] distances = new int[size];
            Arrays.fill(distances, -1); // O(n) space.

            Queue<Integer> queue = new LinkedList<>();
            queue.add(startId); // Initialize queue.

            distances[startId] = 0;

            HashSet<Integer> discovered = new HashSet<>(); //O(n) space. Could be further optimized. I leave it to you to optimize it.
            discovered.add(startId);

            while (!queue.isEmpty()) {  // Standard BFS loop.
                //REMOVE FIRST ELEMENT FROM QUEUE
                int currentNode = queue.poll();
                for (int neighbour : adjLst.get(currentNode)) {
                    if (!discovered.contains(neighbour))
                    {
                        queue.offer(neighbour);
                        discovered.add(neighbour); // Right place to add the visited / discovered set.
                        distances[neighbour] = distances[currentNode] + EDGE_DISTANCE;
                    }
                }
            }
            return distances;
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
