package programmers.level2.타일링_2xn_231226;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TilingTest {
	@Test
	public void test() {
		assertEquals(2, new Tiling().solution(2));
		assertEquals(3, new Tiling().solution(3));
		assertEquals(5, new Tiling().solution(4));
		assertEquals(8, new Tiling().solution(5));
		assertEquals(13, new Tiling().solution(6));

	}
}