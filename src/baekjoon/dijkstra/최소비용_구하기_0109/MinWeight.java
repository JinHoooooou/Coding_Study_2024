package baekjoon.dijkstra.최소비용_구하기_0109;

import java.io.*;
import java.util.*;

public class MinWeight {
	private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter WRITER = new BufferedWriter(new OutputStreamWriter(System.out));
	private static int vertexCount;
	private static int edgeCount;
	private static List<Edge>[] graph;
	private static int source;
	private static int destination;


	public static void main(String[] args) throws IOException {
		parsingInput2();

		int[] minDistanceFromSource = new int[vertexCount + 1];
		boolean[] visit = new boolean[vertexCount + 1];
		for (int i = 1; i <= vertexCount; i++) {
			minDistanceFromSource[i] = Integer.MAX_VALUE;
			visit[i] = false;
		}


		PriorityQueue<Edge> queue = new PriorityQueue<>(Comparator.comparing(x -> x.weight));
		minDistanceFromSource[source] = 0;
		queue.add(new Edge(source, source, 0));

		while (!queue.isEmpty()) {
			Edge minEdge = queue.remove();

			if (visit[minEdge.to]) {
				continue;
			}
			visit[minEdge.to] = true;

			for (Edge adjEdge : graph[minEdge.to]) {
				if (minDistanceFromSource[adjEdge.to] > minDistanceFromSource[adjEdge.from] + adjEdge.weight) {
					minDistanceFromSource[adjEdge.to] = minDistanceFromSource[adjEdge.from] + adjEdge.weight;
					queue.add(new Edge(adjEdge.from, adjEdge.to, minDistanceFromSource[adjEdge.to]));
				}
			}
		}

		WRITER.write(minDistanceFromSource[destination] + "\n");
		WRITER.close();
		READER.close();
	}

	private static void parsingInput() throws IOException {
		StringTokenizer tokenizer = new StringTokenizer(READER.readLine());
		vertexCount = Integer.parseInt(tokenizer.nextToken());
		tokenizer = new StringTokenizer(READER.readLine());
		edgeCount = Integer.parseInt(tokenizer.nextToken());
		graph = parsingGraph();
		tokenizer = new StringTokenizer(READER.readLine());
		source = Integer.parseInt(tokenizer.nextToken());
		destination = Integer.parseInt(tokenizer.nextToken());
	}


	private static List<Edge>[] parsingGraph() throws IOException {
		List<Edge>[] result = new List[vertexCount + 1];
		for (int i = 1; i <= vertexCount; i++) {
			result[i] = new ArrayList<>();
		}
		for (int i = 2; i < edgeCount + 2; i++) {
			StringTokenizer tokenizer = new StringTokenizer(READER.readLine());
			int from = Integer.parseInt(tokenizer.nextToken());
			int to = Integer.parseInt(tokenizer.nextToken());
			int weight = Integer.parseInt(tokenizer.nextToken());
			result[from].add(new Edge(from, to, weight));
		}
		return result;
	}

	private static void parsingInput2() {
		int[][] input = READER.lines().map(x -> x.split(" "))
						.map(x -> Arrays.stream(x).mapToInt(Integer::parseInt).toArray())
						.toArray(int[][]::new);
		vertexCount = input[0][0];
		edgeCount = input[1][0];
		graph = parsingGraph(input);
		source = input[input.length - 1][0];
		destination = input[input.length - 1][1];
	}

	private static List<Edge>[] parsingGraph(int[][] input) {
		List<Edge>[] result = new List[vertexCount + 1];
		for (int i = 1; i <= vertexCount; i++) {
			result[i] = new ArrayList<>();
		}
		for (int i = 2; i < edgeCount + 2; i++) {
			result[input[i][0]].add(new Edge(input[i]));
		}
		return result;
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

	public Edge(int[] values) {
		this.from = values[0];
		this.to = values[1];
		this.weight = values[2];
	}
}