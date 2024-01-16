package programmers.level2.삼각_달팽이_0115;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class TriSnailTest {
	@Test
	public void test1() {
		int n = 1;

		int[] expected = {1};
		assertThat(new TriSnail().solution(n)).isEqualTo(expected);
	}

	@Test
	public void test2() {
		int n = 2;

		int[] expected = {1, 2, 3};
		assertThat(new TriSnail().solution(n)).isEqualTo(expected);
	}

	@Test
	public void test3() {
		int n = 3;

		int[] expected = {1, 2, 6, 3, 4, 5};
		assertThat(new TriSnail().solution(n)).isEqualTo(expected);
	}

	@Test
	public void test4() {
		int n = 4;

		int[] expected = {1, 2, 9, 3, 10, 8, 4, 5, 6, 7};
		assertThat(new TriSnail().solution(n)).isEqualTo(expected);
	}

	@Test
	public void test5() {
		int n = 5;

		int[] expected = {1, 2, 12, 3, 13, 11, 4, 14, 15, 10, 5, 6, 7, 8, 9};
		assertThat(new TriSnail().solution(n)).isEqualTo(expected);
	}

	@Test
	public void test6() {
		int n = 10;

		int[] expected = {1,
						2, 27,
						3, 28, 26,
						4, 29, 45, 25,
						5, 30, 46, 44, 24,
						6, 31, 47, 54, 43, 23,
						7, 32, 48, 55, 53, 42, 22,
						8, 33, 49, 50, 51, 52, 41, 21,
						9, 34, 35, 36, 37, 38, 39, 40, 20,
						10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
		assertThat(new TriSnail().solution2(n)).isEqualTo(expected);
	}

}