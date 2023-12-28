package programmers.level2.택배상자_231228;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParcelTest {
	@Test
	public void test1() {
		int[] order = {4, 3, 1, 2, 5};
		int expected = 2;
		assertEquals(expected, new Parcel().solution(order));
	}

	@Test
	public void test2() {
		int[] order = {5, 4, 3, 2, 1};
		int expected = 5;
		assertEquals(expected, new Parcel().solution(order));
	}
	@Test
	public void test3() {
		int[] order = {4, 3, 1, 2, 5};
		int expected = 2;
		assertEquals(expected, new Parcel().solution2(order));
	}

	@Test
	public void test4() {
		int[] order = {5, 4, 3, 2, 1};
		int expected = 5;
		assertEquals(expected, new Parcel().solution2(order));
	}

}