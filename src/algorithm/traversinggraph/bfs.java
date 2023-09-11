package algorithm.traversinggraph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {

  private int V;

  // Adjacency Lists
  private LinkedList<Integer> adj[];

  // Constructor
  bfs(int v) {
    V = v;
    adj = new LinkedList[v];
    for (int i = 0; i < v; ++i)
      adj[i] = new LinkedList();
  }

  // Function to add an edge into the graph
  void addEdge(int v, int w) {
    adj[v].add(w);
  }

  // bfs traversal algorithm
  private void bfss(int i) {
    Queue<Integer> q = new LinkedList<>();

    boolean[] vis = new boolean[V];

    vis[i] = true;

    q.add(i);
    while (q.size() != 0) {

      i = q.poll();
      System.out.print(i + " ");

      Iterator<Integer> itr = adj[i].listIterator();

      while (itr.hasNext()) {

        int n = itr.next();

        if (!vis[n]) {

          vis[n] = true;
          q.add(n);
        }

      }

    }

  }

  // level order traversal

  private static int findLevel(int v, int[][] edges, int x) {

    int maxVertex = 0;

    for (int[] it : edges) {
      maxVertex = Math.max(maxVertex, Math.max(it[0], it[1]));
    }

    ArrayList<Integer>[] adList = new ArrayList[maxVertex + 1];

    for (int i = 0; i <= maxVertex; i++) {
      adList[i] = new ArrayList<>();
    }

    for (int i = 0; i < edges.length; i++) {
      adList[edges[i][0]].add(edges[i][1]);
      adList[edges[i][1]].add(edges[i][0]);
    }

    if (x > maxVertex || adList[x].isEmpty())
      return -1;

    Queue<Integer> q = new LinkedList<>();

    q.offer(0);

    int level = 0;

    boolean[] vis = new boolean[maxVertex + 1];

    while (!q.isEmpty()) {

      int size = q.size();

      while (size-- != 0) {

        int node = q.poll();
        if (node == x) {
          return level;
        }

        for (int it : adList[node]) {

          if (!vis[it]) {
            q.offer(it);
            vis[it] = true;
          }
        }

      }
      level++;
    }

    return -1;

  }

  public static void main(String[] args) {

    bfs g = new bfs(4);
    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(2, 0);
    g.addEdge(2, 3);
    g.addEdge(3, 3);

    System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

    g.bfss(2);

    int V = 5;
    int[][] edges = { { 0, 1 }, { 0, 2 }, { 1, 3 }, { 2, 4 } };
    int X = 3;

    // Function call
    int level = findLevel(V, edges, X);
    System.out.println();
    System.out.println("level for the order  " + level);

  }

}
