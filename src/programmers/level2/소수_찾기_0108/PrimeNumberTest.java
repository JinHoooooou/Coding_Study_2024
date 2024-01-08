package programmers.level2.소수_찾기_0108;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {

	@Test
	public void test1() {
		String numbers = "17";

		int expected = 3;

		assertEquals(expected, new PrimeNumber().solution(numbers));
	}

	@Test
	public void test2() {
		String numbers = "011";

		int expected = 2;

		assertEquals(expected, new PrimeNumber().solution(numbers));
	}
}