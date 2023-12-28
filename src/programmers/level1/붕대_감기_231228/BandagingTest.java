package programmers.level1.붕대_감기_231228;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BandagingTest {
	@Test
	public void test1() {
		int[] bandage = {5, 1, 5};
		int health = 30;
		int[][] attacks = {
						{2, 10},
						{9, 15},
						{10, 5},
						{11, 5}
		};
		int expected = 5;
		assertEquals(expected, new Bandaging().solution(bandage, health, attacks));
	}

	@Test
	public void test2() {
		int[] bandage = {3, 2, 7};
		int health = 20;
		int[][] attacks = {
						{1, 15},
						{5, 16},
						{8, 6},
		};
		int expected = -1;
		assertEquals(expected, new Bandaging().solution(bandage, health, attacks));
	}

	@Test
	public void test3() {
		int[] bandage = {4, 2, 7};
		int health = 20;
		int[][] attacks = {
						{1, 15},
						{5, 16},
						{8, 6},
		};
		int expected = -1;
		assertEquals(expected, new Bandaging().solution(bandage, health, attacks));
	}

	@Test
	public void test4() {
		int[] bandage = {1, 1, 1};
		int health = 5;
		int[][] attacks = {
						{1, 2},
						{3, 2},
		};
		int expected = 3;
		assertEquals(expected, new Bandaging().solution(bandage, health, attacks));
	}
}