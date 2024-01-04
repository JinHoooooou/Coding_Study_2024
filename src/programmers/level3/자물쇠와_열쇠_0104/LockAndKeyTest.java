package programmers.level3.자물쇠와_열쇠_0104;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LockAndKeyTest {
	@Test
	public void test1() {
		int[][] key = {
						{0, 0, 0},
						{1, 0, 0},
						{0, 1, 1}
		};
		int[][] lock = {
						{1, 1, 1},
						{1, 1, 0},
						{1, 0, 1}
		};
		assertTrue(new LockAndKey().solution(key, lock));
	}
}