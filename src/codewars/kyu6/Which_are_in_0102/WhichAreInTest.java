package codewars.kyu6.Which_are_in_0102;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhichAreInTest {
	@Test
	public void test() {
		String[] a1 = {"arp", "live", "strong"};
		String[] a2 = {"lively", "alive", "harp", "sharp", "armstrong"};

		String[] expected = {"arp", "live", "strong"};
		assertArrayEquals(expected, WhichAreIn.inArray(a1, a2));
	}
}