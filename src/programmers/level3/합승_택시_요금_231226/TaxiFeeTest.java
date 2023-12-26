package programmers.level3.합승_택시_요금_231226;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxiFeeTest {
	@Test
	public void test1() {
		int n = 6;
		int s = 4;
		int a = 6;
		int b = 2;
		int[][] fares = {
						{4, 1, 10},
						{3, 5, 24},
						{5, 6, 2},
						{3, 1, 41},
						{5, 1, 24},
						{4, 6, 50},
						{2, 4, 66},
						{2, 3, 22},
						{1, 6, 25}
		};

		int expected = 82;

		assertEquals(expected, new TaxiFee().solution(n, s, a, b, fares));
	}
}