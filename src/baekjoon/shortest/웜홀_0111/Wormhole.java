package baekjoon.shortest.웜홀_0111;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Wormhole {

	private static BufferedReader reader;
	private static BufferedWriter writer;
	private static StringTokenizer tokenizer;
	private static int vertexCount;
	private static int edgeCount;
	private static int wormholeCount;
	private static List<Edge> edges;

	public static void main(String[] args) throws IOException {
		reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new BufferedWriter(new OutputStreamWriter(System.out));
		tokenizer = new StringTokenizer(reader.readLine());
		int loop = Integer.parseInt(tokenizer.nextToken());
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < loop; i++) {
			parseInput();
			result.append(isNegativeLoop() ? "YES" : "NO").append("\n");
		}

		writer.write(result.toString().trim());
		writer.close();
		reader.close();
	}

	private static boolean isNegativeLoop() {
		int[] minDistanceFromSource = new int[vertexCount + 1];
		Arrays.fill(minDistanceFromSource, 999999);
		minDistanceFromSource[1] = 0;

		for (int i = 0; i < edgeCount + wormholeCount; i++) {
			for (Edge target : edges) {

				if (minDistanceFromSource[target.to] > minDistanceFromSource[target.from] + target.weight) {
					minDistanceFromSource[target.to] = minDistanceFromSource[target.from] + target.weight;
				}
			}
		}

		for (Edge target : edges) {
			if (minDistanceFromSource[target.to] > minDistanceFromSource[target.from] + target.weight) {
				return true;
			}
		}
		return false;
	}

	private static void parseInput() throws IOException {
		tokenizer = new StringTokenizer(reader.readLine());
		vertexCount = Integer.parseInt(tokenizer.nextToken());
		edgeCount = Integer.parseInt(tokenizer.nextToken());
		wormholeCount = Integer.parseInt(tokenizer.nextToken());
		parseGraph();
	}

	private static void parseGraph() throws IOException {
		edges = new ArrayList<>();

		for (int i = 0; i < edgeCount + wormholeCount; i++) {
			tokenizer = new StringTokenizer(reader.readLine());
			int from = Integer.parseInt(tokenizer.nextToken());
			int to = Integer.parseInt(tokenizer.nextToken());
			int weight = Integer.parseInt(tokenizer.nextToken());

			if (i < edgeCount) {
				edges.add(new Edge(from, to, weight));
				edges.add(new Edge(to, from, weight));
			} else {
				edges.add(new Edge(from, to, -weight));
			}

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
}