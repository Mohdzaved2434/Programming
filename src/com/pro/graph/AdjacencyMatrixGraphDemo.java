package com.pro.graph;

public class AdjacencyMatrixGraphDemo {
    int vertex;
    int matrix[][];

    public AdjacencyMatrixGraphDemo(int vertex) {
        this.vertex = vertex;
        matrix = new int[vertex][vertex];
    }

    public void addEdge(int source, int destination) {
        matrix[source][destination] = 1;
        matrix[destination][source] = 1;
    }

    public void printGraph() {
        System.out.println("Graph: (Adjacency Matrix)");
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex; j++) {
                System.out.println(matrix[i][j] + " ");
            }
        }
        for (int i = 0; i < vertex; i++) {
            System.out.println("Vertex " + i + " is connected to:");
            for (int j = 0; j < vertex; j++) {
                if (matrix[i][j] == 1) {
                    System.out.println(j + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        AdjacencyMatrixGraphDemo graph = new AdjacencyMatrixGraphDemo(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.printGraph();
    }
}