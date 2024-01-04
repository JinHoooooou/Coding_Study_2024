package programmers.level2.쿼드압축_후_개수_세기_0103;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadCompressTest {
	@Test
	public void test1() {
		int[][] arr = {
						{1, 1, 0, 0},
						{1, 0, 0, 0},
						{1, 0, 0, 1},
						{1, 1, 1, 1}
		};
		int[] expected = {4, 9};
		assertArrayEquals(expected, new QuadCompress().solution(arr));
	}

	@Test
	public void test2() {
		int[][] arr = {
						{1, 1, 1, 1, 1, 1, 1, 1},
						{0, 1, 1, 1, 1, 1, 1, 1},
						{0, 0, 0, 0, 1, 1, 1, 1},
						{0, 1, 0, 0, 1, 1, 1, 1},
						{0, 0, 0, 0, 0, 0, 1, 1},
						{0, 0, 0, 0, 0, 0, 0, 1},
						{0, 0, 0, 0, 1, 0, 0, 1},
						{0, 0, 0, 0, 1, 1, 1, 1}
		};
		int[] expected = {10, 15};
		assertArrayEquals(expected, new QuadCompress().solution(arr));
	}
}