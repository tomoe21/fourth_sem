import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.LinkedList;

public class Graph {
	LinkedList<Integer>[] adjacentList;
	int vertices;

	Graph(int vertices) {
		this.vertices=vertices;
		adjacentList=new LinkedList[vertices];
		for(int i=0;i<vertices;i++) adjacentList[i]=new LinkedList<>();
	}

	void addEdge(int source,int destination) {
		adjacentList[source].add(destination);
		adjacentList[destination].add(source);
	}

	void readGraph() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of edges: ");
		int edges=sc.nextInt();
		for(int i=0;i<edges;i++) {
			System.out.println("Enter edge "+i+":");
			int source=sc.nextInt(),destination=sc.nextInt();
			addEdge(source,destination);
		}
		sc.close();
	}

	void BFS(int initial) {
		boolean[] visited=new boolean[vertices];
		Queue<Integer> queue=new ArrayDeque<>();
		visited[initial]=true;
		queue.add(initial);

		System.out.println("Breadth First Traversal:");

		while(!queue.isEmpty()) {
			int node=queue.poll();
			System.out.print(node + " ");

			for(int neighbour:adjacentList[node]) 
				if(!visited[neighbour]) {
					queue.add(neighbour);
					visited[neighbour]=true;
				}
		}
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of vertices: ");
		int vertices=sc.nextInt();
		Graph graph=new Graph(vertices);
		graph.readGraph();

		System.out.print("Enter the initial vertex: ");
		int initial=sc.nextInt();
		graph.BFS(initial);

		sc.close();
	}
}
