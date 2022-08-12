package algorithms.graphs.BFS;

import java.util.*;

public class Graph{
    private int numVertices;
    private LinkedList<Integer> adjlist[];

    public Graph(int numVertices){
        this.numVertices = numVertices;
        adjlist = new LinkedList[numVertices];
        for(int i = 0;i<numVertices; i++){
            adjlist[i] = new LinkedList<>();
        }
    }

    public void addEdge(int vertexA, int vertexB){
        adjlist[vertexA].add(vertexB);
    }

    void traversal(int source){
        boolean visitedNodes[] = new boolean[numVertices];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visitedNodes[source] = true;
        System.out.println("The source for this Breadth First Search is " + source);
        queue.add(source);
        while(queue.size() > 0){
            source = queue.poll();
            System.out.println("Dequeued " + source);
            //iterating through adjacency list
            Iterator<Integer> i = adjlist[source].listIterator();
            while(i.hasNext()){
                int next = i.next();
                if(!visitedNodes[next]){
                    visitedNodes[next] = true;
                    System.out.println(next + " has been added to the queue.");
                    queue.add(next);
                }
            }
        }
    }
}