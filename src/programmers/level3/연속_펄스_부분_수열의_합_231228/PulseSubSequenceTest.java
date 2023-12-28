package programmers.level3.연속_펄스_부분_수열의_합_231228;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PulseSubSequenceTest {
	@Test
	public void test() {
		assertEquals(10, new PulseSubSequence().solution(new int[]{2, 3, -6, 1, 3, -1, 2, 4}));
	}
}