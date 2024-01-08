package programmers.level2.다리를_지나는_트럭_0108;

import java.util.LinkedList;
import java.util.Queue;

// 틀림
public class Truck {
	public int solution(int bridgeLength, int weight, int[] truckWeights) {
		Queue<Integer> bridge = new LinkedList<>();
		int index = 0;
		int weightSum = 0;
		int seconds = 0;

		while (index < truckWeights.length) {
			if (bridge.size() == bridgeLength) {
				weightSum -= bridge.remove();
			}

			if (truckWeights[index] + weightSum <= weight
							&& bridge.size() < bridgeLength) {
				int inTruck = truckWeights[index];
				bridge.add(inTruck);
				weightSum += inTruck;
				index++;
			} else {
				bridge.add(0);
			}

			seconds++;
		}

		return seconds + bridgeLength;
	}
}
