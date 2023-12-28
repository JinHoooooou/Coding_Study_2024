package programmers.level2.두개_이하_다른_비트_231228;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DifferentBitTest {

	@Test
	public void test() {
		long[] numbers = {2, 7};
		long[] expected = {3, 11};
		assertArrayEquals(expected, new DifferentBit().solution(numbers));
	}
}