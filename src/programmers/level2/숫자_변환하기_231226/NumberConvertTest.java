package programmers.level2.숫자_변환하기_231226;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberConvertTest {
	@Test
	public void test1() {
		int x = 10;
		int y = 40;
		int n = 5;

		int expected = 2;
		assertEquals(expected, new NumberConvert().solution(x, y, n));
	}

	@Test
	public void test2() {
		int x = 10;
		int y = 40;
		int n = 30;

		int expected = 1;
		assertEquals(expected, new NumberConvert().solution(x, y, n));
	}

	@Test
	public void test3() {
		int x = 2;
		int y = 5;
		int n = 4;

		int expected = -1;
		assertEquals(expected, new NumberConvert().solution(x, y, n));
	}
}