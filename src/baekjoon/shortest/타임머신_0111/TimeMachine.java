package baekjoon.shortest.타임머신_0111;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class TimeMachine {

	private static BufferedReader reader;
	private static BufferedWriter writer;
	private static final int SOURCE = 1;
	private static int vertexCount;
	private static int edgeCount;
	private static List<Edge> edges;


	public static void main(String[] args) throws IOException {
		parseInput();
		long[] minDistanceFromSource;
		minDistanceFromSource = bellmanFord();

		StringBuilder result = new StringBuilder();

		if (minDistanceFromSource.length == 1 && minDistanceFromSource[0] == -1) {
			result.append("-1\n");
		}
		for (int i = 2; i < minDistanceFromSource.length; i++) {
			if (minDistanceFromSource[i] == Long.MAX_VALUE) {
				result.append("-1\n");
			} else {
				result.append(minDistanceFromSource[i]).append("\n");
			}
		}
		writer.write(result.toString().trim());

		writer.close();
		reader.close();
	}

	private static long[] bellmanFord() {
		long[] minDistanceFromSource = new long[vertexCount + 1];
		Arrays.fill(minDistanceFromSource, Long.MAX_VALUE);
		minDistanceFromSource[SOURCE] = 0;

		for (int i = 0; i <= vertexCount; i++) {

			for (Edge target : edges) {
				if (minDistanceFromSource[target.from] == Long.MAX_VALUE) {
					continue;
				}
				if (minDistanceFromSource[target.to] > minDistanceFromSource[target.from] + target.weight) {
					if (i == vertexCount) {
						return new long[]{-1};
					}
					minDistanceFromSource[target.to] = minDistanceFromSource[target.from] + target.weight;
				}
			}
		}
		return minDistanceFromSource;
	}

	private static void parseInput() throws IOException {
		writer = new BufferedWriter(new OutputStreamWriter(System.out));
		reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		vertexCount = Integer.parseInt(tokenizer.nextToken());
		edgeCount = Integer.parseInt(tokenizer.nextToken());
		parseToGraph();
	}

	private static void parseToGraph() throws IOException {
		edges = new ArrayList<>();
		for (int i = 0; i < edgeCount; i++) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			int from = Integer.parseInt(tokenizer.nextToken());
			int to = Integer.parseInt(tokenizer.nextToken());
			int weight = Integer.parseInt(tokenizer.nextToken());
			edges.add(new Edge(from, to, weight));
		}
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