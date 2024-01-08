package programmers.level2.다리를_지나는_트럭_0108;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TruckTest {

	@Test
	public void test1() {
		int bridgeLength = 2;
		int weight = 10;
		int[] truckWeights = {7, 4, 5, 6};

		int expected = 8;

		assertEquals(expected, new Truck().solution(bridgeLength, weight, truckWeights));
	}

	@Test
	public void test2() {
		int bridgeLength = 100;
		int weight = 100;
		int[] truckWeights = {10};

		int expected = 101;

		assertEquals(expected, new Truck().solution(bridgeLength, weight, truckWeights));
	}

	@Test
	public void test3() {
		int bridgeLength = 100;
		int weight = 100;
		int[] truckWeights = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};

		int expected = 110;

		assertEquals(expected, new Truck().solution(bridgeLength, weight, truckWeights));
	}
}