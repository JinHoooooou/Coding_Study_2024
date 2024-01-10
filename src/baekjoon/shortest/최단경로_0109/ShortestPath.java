package baekjoon.shortest.최단경로_0109;

import java.io.*;
import java.util.*;

public class ShortestPath {

	private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter WRITER = new BufferedWriter(new OutputStreamWriter(System.out));
	private static StringTokenizer tokenizer;
	private static int vertexCount;
	private static int edgeCount;
	private static int source;
	private static List<Edge>[] graph;
	private static List<Edge> edges;

	public static void main(String[] args) throws IOException {
		parseInput();
		int[] minDistanceFromSource;
//		minDistanceFromSource = dijkstra();
		minDistanceFromSource = bellmanFord();
		StringBuilder result = makeOutput(minDistanceFromSource);

		WRITER.write(result.toString());
		WRITER.close();
		READER.close();
	}

	private static int[] bellmanFord() {
		int[] distance = new int[vertexCount + 1];
		Arrays.fill(distance, Integer.MAX_VALUE);
		distance[source] = 0;

		for (int i = 0; i < edgeCount; i++) {
			for (Edge edge : edges) {
				if (distance[edge.from] == Integer.MAX_VALUE) {
					continue;
				}
				if (distance[edge.to] > distance[edge.from] + edge.weight) {
					distance[edge.to] = distance[edge.from] + edge.weight;
				}
			}
		}

		for (Edge edge : edges) {
			if (distance[edge.from] == Integer.MAX_VALUE) {
				continue;
			}
			if (distance[edge.to] > distance[edge.from] + edge.weight) {
				return null;
			}
		}

		return distance;
	}

	private static void parseInput() throws IOException {
		tokenizer = new StringTokenizer(READER.readLine());
		vertexCount = Integer.parseInt(tokenizer.nextToken());
		edgeCount = Integer.parseInt(tokenizer.nextToken());
		tokenizer = new StringTokenizer(READER.readLine());
		source = Integer.parseInt(tokenizer.nextToken());
		parseGraph();
	}

	private static void parseGraph() throws IOException {
		graph = new List[vertexCount + 1];
		edges = new ArrayList<>();
		for (int i = 1; i <= vertexCount; i++) {
			graph[i] = new ArrayList<>();
		}
		for (int i = 0; i < edgeCount; i++) {
			tokenizer = new StringTokenizer(READER.readLine());
			int from = Integer.parseInt(tokenizer.nextToken());
			int to = Integer.parseInt(tokenizer.nextToken());
			int weight = Integer.parseInt(tokenizer.nextToken());
			graph[from].add(new Edge(from, to, weight));
			edges.add(new Edge(from, to, weight));
		}
	}

	private static int[] dijkstra() {
		PriorityQueue<Edge> queue = new PriorityQueue<>(Comparator.comparing(x -> x.weight));
		int[] distance = new int[vertexCount + 1];
		for (int i = 1; i <= vertexCount; i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		distance[source] = 0;
		queue.add(new Edge(source, source, 0));

		while (!queue.isEmpty()) {
			Edge minEdge = queue.remove();

			for (Edge adjEdge : graph[minEdge.to]) {
				if (distance[adjEdge.to] > distance[adjEdge.from] + adjEdge.weight) {
					distance[adjEdge.to] = distance[adjEdge.from] + adjEdge.weight;
					queue.add(new Edge(adjEdge.from, adjEdge.to, distance[adjEdge.to]));
				}
			}
		}
		return distance;
	}

	private static StringBuilder makeOutput(int[] minDistanceFromSource) {
		StringBuilder result = new StringBuilder();
		for (int i = 1; i <= vertexCount; i++) {
			if (minDistanceFromSource[i] == Integer.MAX_VALUE) {
				result.append("INF\n");
			} else {
				result.append(minDistanceFromSource[i]).append("\n");
			}
		}
		return result;
	}
}

class Edge {
	public int from;
	public int to;
	public int weight;

	public Edge(int from, int to, int weight) {
		this.from = from;
		this.to = to;
		this.weight = weight;
	}
}