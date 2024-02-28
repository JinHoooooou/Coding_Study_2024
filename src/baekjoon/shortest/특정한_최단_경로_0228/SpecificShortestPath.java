package baekjoon.shortest.특정한_최단_경로_0228;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class SpecificShortestPath {

  static int vertexCount;
  static int edgeCount;
  static List<Edge>[] edges;

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
    vertexCount = Integer.parseInt(tokenizer.nextToken());
    edgeCount = Integer.parseInt(tokenizer.nextToken());
    edges = new List[vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      edges[i] = new ArrayList<>();
    }

    for (int i = 0; i < edgeCount; i++) {
      tokenizer = new StringTokenizer(reader.readLine());
      int from = Integer.parseInt(tokenizer.nextToken());
      int to = Integer.parseInt(tokenizer.nextToken());
      int weight = Integer.parseInt(tokenizer.nextToken());
      edges[from].add(new Edge(to, weight));
      edges[to].add(new Edge(from, weight));
    }

    tokenizer = new StringTokenizer(reader.readLine());
    int must1 = Integer.parseInt(tokenizer.nextToken());
    int must2 = Integer.parseInt(tokenizer.nextToken());

    int min1 = dijkstra(1, must1) + dijkstra(must1, must2) + dijkstra(must2, vertexCount);
    int min2 = dijkstra(1, must2) + dijkstra(must2, must1) + dijkstra(must1, vertexCount);

    if (min1 == Integer.MAX_VALUE || min2 == Integer.MAX_VALUE) {
      writer.write("-1");
    } else {
      writer.write(Math.min(min1, min2) + "");
    }
    writer.flush();
  }

  private static int dijkstra(int source, int destination) {
    PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparing(x -> x[1]));
    int[] minDistanceFromSource = new int[vertexCount + 1];
    Arrays.fill(minDistanceFromSource, Integer.MAX_VALUE);

    queue.add(new int[]{source, 0});
    minDistanceFromSource[source] = 0;

    while (!queue.isEmpty()) {
      int[] current = queue.remove();
      int currentNode = current[0];

      for (Edge adjEdge : edges[currentNode]) {
        if (minDistanceFromSource[adjEdge.to]
            > minDistanceFromSource[currentNode] + adjEdge.weight) {
          minDistanceFromSource[adjEdge.to] = minDistanceFromSource[currentNode] + adjEdge.weight;
          queue.add(new int[]{adjEdge.to, minDistanceFromSource[adjEdge.to]});
        }
      }
    }
    return minDistanceFromSource[destination];
  }
}

class Edge {

  int to;
  int weight;

  public Edge(int to, int weight) {
    this.to = to;
    this.weight = weight;
  }

}
