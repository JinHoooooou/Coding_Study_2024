package programmers.level3.합승_택시_요금_231226;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

// 틀림
public class TaxiFee {
	public int solution(int n, int s, int a, int b, int[][] fares) {

		List<int[]>[] adjList = new List[n + 1];

		for (int i = 1; i <= n; i++) {
			adjList[i] = new ArrayList<>();
		}

		for (int[] fare : fares) {
			int from = fare[0];
			int to = fare[1];
			int fee = fare[2];

			adjList[from].add(new int[]{to, fee});
			adjList[to].add(new int[]{from, fee});
		}

		int[] minDistanceFromA = dijkstra(adjList, a);
		int[] minDistanceFromB = dijkstra(adjList, b);
		int[] minDistanceFromS = dijkstra(adjList, s);

		int min = Integer.MAX_VALUE;
		for (int i = 1; i <= n; i++) {
			int distance = minDistanceFromA[i] + minDistanceFromB[i] + minDistanceFromS[i];
			min = Math.min(min, distance);
		}

		return min;
	}

	private int[] dijkstra(List<int[]>[] adjList, int source) {
		int[] minDistanceFromSource = new int[adjList.length];
		for (int i = 1; i < minDistanceFromSource.length; i++) {
			minDistanceFromSource[i] = Integer.MAX_VALUE;
		}
		PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));

		queue.add(new int[]{source, 0});
		minDistanceFromSource[source] = 0;

		while (!queue.isEmpty()) {
			int[] currentEdge = queue.remove();
			int node = currentEdge[0];

			for (int[] adjEdge : adjList[node]) {
				int to = adjEdge[0];
				int dist = adjEdge[1];
				if (minDistanceFromSource[to] > minDistanceFromSource[node] + dist) {
					minDistanceFromSource[to] = minDistanceFromSource[node] + dist;
					queue.add(new int[]{to, minDistanceFromSource[to]});
				}

			}
		}

		return minDistanceFromSource;
	}
}
