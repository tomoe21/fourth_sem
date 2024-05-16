import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;

class Graph {
    int vertices;
    ArrayList<LinkedList<Integer>> adjacencyList;

    Graph(int vertices) {
        this.vertices=vertices;
        adjacencyList=new ArrayList<>(vertices);
        for(int i=0;i<vertices;i++) adjacencyList.add(new LinkedList<>());
    }

    void addEdge(int source,int destination) {
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source); 
    }
    
    void readGraph() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of edges:");
        int edges = sc.nextInt();

        for (int i = 0; i < edges; i++) {
        	System.out.println("Enter edge: ");
            int source = sc.nextInt(),destination = sc.nextInt();
            addEdge(source, destination);
        }
        sc.close();
    }

    void displayAdjacencyList() {
        System.out.println("Adjacency List:");
        for(int i=0;i<vertices;i++) {
            System.out.print(i + ": ");
            for (Integer vertex: adjacencyList.get(i)) System.out.print(vertex+" ");
            System.out.println();
        }
    }

    void DFS(int initial) {
        boolean[] visited = new boolean[vertices];
        DFSRec(initial, visited);
    }
    void DFSRec(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (Integer adjacentVertex : adjacencyList.get(vertex)) 
            if (!visited[adjacentVertex]) DFSRec(adjacentVertex, visited);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of vertices:");
        int vertices = sc.nextInt();

        Graph graph = new Graph(vertices);
        graph.readGraph();
        graph.displayAdjacencyList();

        System.out.print("Enter the initial vertex:");
        int initial = sc.nextInt();

        System.out.println("Depth First Search traversal: ");
        graph.DFS(initial);
        
        sc.close();
    }
}
