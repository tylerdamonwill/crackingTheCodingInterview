import java.io.*;
import java.util.*;

class Graph {
    private int V; // No. of vertices
 
    // Array  of lists for
    // Adjacency List Representation
    private LinkedList<Integer> adj[];
 
    // Constructor
    public Graph(int v) {
        this.V = v;
        this.adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<Integer>();
        }
    }
 
    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w); // Add w to v's list.
    }
 
    // A function used by DFS
    void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");
 
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    void DFS(int v) {
        boolean visited[] = new boolean[V];
 
        DFSUtil(v, visited);
    }
 
    // Driver Code
    public static void main(String args[]) {
        Graph g = new Graph(4);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println(
            "Following is Depth First Traversal "
            + "(starting from vertex 2)");
 
        g.DFS(2);
    }
}
