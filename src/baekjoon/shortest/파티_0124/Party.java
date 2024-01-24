package baekjoon.shortest.파티_0124;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Party {

  private static BufferedReader reader;
  private static int vertexCount;
  private static int edgeCount;
  private static int destination;
  private static List<Edge>[] adjList;



  public static void main(String[] args) throws IOException {
    parseInput();

    int max = Integer.MIN_VALUE;
    int[] minDistanceFromDestination = dijkstra(destination);
    int[][] minDistanceFromSource = new int[vertexCount + 1][];
    for (int i = 1; i <= vertexCount; i++) {
      minDistanceFromSource[i] = dijkstra(i);
      max = Math.max(minDistanceFromDestination[i] + minDistanceFromSource[i][destination], max);
    }

    System.out.print(max);

    reader.close();
  }

  private static void parseInput() throws IOException {
    reader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

    vertexCount = Integer.parseInt(tokenizer.nextToken());
    edgeCount = Integer.parseInt(tokenizer.nextToken());
    destination = Integer.parseInt(tokenizer.nextToken());

    adjList = new List[vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      adjList[i] = new ArrayList<>();
    }

    for (int i = 0; i < edgeCount; i++) {
      tokenizer = new StringTokenizer(reader.readLine());
      int from = Integer.parseInt(tokenizer.nextToken());
      int to = Integer.parseInt(tokenizer.nextToken());
      int weight = Integer.parseInt(tokenizer.nextToken());

      adjList[from].add(new Edge(from, to, weight));
    }
  }

  private static int[] dijkstra(int source) {
    int[] minDistanceFromSource = new int[vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      minDistanceFromSource[i] = Integer.MAX_VALUE;
    }
    boolean[] visit = new boolean[vertexCount + 1];
    PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(Comparator.comparing(x -> x[1]));
    priorityQueue.add(new int[]{source, 0});
    minDistanceFromSource[source] = 0;

    while (!priorityQueue.isEmpty()) {
      int[] current = priorityQueue.remove();
      if (visit[current[0]]) {
        continue;
      }
      visit[current[0]] = true;
      for (Edge adjEdge : adjList[current[0]]) {
        if (minDistanceFromSource[adjEdge.to] > minDistanceFromSource[adjEdge.from] + adjEdge.weight) {
          minDistanceFromSource[adjEdge.to] = minDistanceFromSource[adjEdge.from] + adjEdge.weight;
          priorityQueue.add(new int[]{adjEdge.to, minDistanceFromSource[adjEdge.to]});
        }
      }
    }

    return minDistanceFromSource;
  }
}

class Edge {
  int from;
  int to;
  int weight;

  public Edge(int from, int to, int weight) {
    this.from = from;
    this.to = to;
    this.weight = weight;
  }
}