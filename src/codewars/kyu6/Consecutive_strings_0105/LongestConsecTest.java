package codewars.kyu6.Consecutive_strings_0105;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecTest {
	@Test
	public void test1() {
		String[] strarr = {"tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"};
		int k = 2;

		String expected = "folingtrashy";
		assertEquals(expected, LongestConsec.longestConsec(strarr, k));
	}

	@Test
	public void test2() {
		String[] strarr = {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
		int k = 2;

		String expected = "abigailtheta";
		assertEquals(expected, LongestConsec.longestConsec(strarr, k));
	}

	@Test
	public void test3() {
		String[] strarr = {};
		int k = 3;

		String expected = "";
		assertEquals(expected, LongestConsec.longestConsec(strarr, k));
	}
}