package algorithms.graphs.DFS;

import java.util.*;

public class Graph{
    private int numVertices;
    private LinkedList[] adjlist;

    public Graph(int numVertices){
        this.numVertices = numVertices;
        adjlist = new LinkedList[numVertices];
        for(int i = 0; i<numVertices; i++){
            adjlist[i] = new LinkedList();
        }
    }

    public void addEdge(int vertex, int destination){
        adjlist[vertex].add(destination);
    }

    public void DFS(int source){
        boolean[] visitedNodes = new boolean[numVertices];
        Stack<Integer> stack = new Stack<>();
        stack.push(source);
        visitedNodes[source] = true;
        System.out.println("The source of the Depth First Search is " + source);
        while(!stack.isEmpty()){
            int currentNode = stack.pop();
            System.out.println("Current node is " + currentNode);
            Iterator<Integer> i = adjlist[currentNode].listIterator();
            while(i.hasNext()){
                int next = i.next();
                if(!visitedNodes[next]){
                    stack.add(next);
                    visitedNodes[next] = true;
                }
            }
        }
    }

}
