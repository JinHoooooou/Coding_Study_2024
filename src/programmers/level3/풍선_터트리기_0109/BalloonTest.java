package programmers.level3.풍선_터트리기_0109;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BalloonTest {
	@Test
	public void test1() {
		int[] a = {9, -1, -5};

		int expected = 3;
		assertEquals(expected, new Balloon().solution(a));
	}

	@Test
	public void test2() {
		int[] a = {-16, 27, 65, -2, 58, -92, -71, -68, -61, -33};

		int expected = 6;
		assertEquals(expected, new Balloon().solution(a));
	}
}