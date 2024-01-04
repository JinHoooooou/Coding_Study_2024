package programmers.level2.가장_큰_수_0103;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiggestNumberTest {

	@Test
	public void test1() {
		int[] numbers = {6, 10, 2};
		String expected = "6210";
		assertEquals(expected, new BiggestNumber().solution(numbers));
	}

	@Test
	public void test2() {
		int[] numbers = {3, 30, 34, 5, 9};
		String expected = "9534330";
		assertEquals(expected, new BiggestNumber().solution(numbers));
	}
}