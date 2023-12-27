package codewars.kyu8.Sort_and_Star_231227;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortAndStarTest {
	@Test
	public void test1() {
		String[] s = {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"};
		assertEquals("b***i***t***c***o***i***n", SortAndStar.twoSort(s));
	}

	@Test
	public void test2() {
		String[] s = {"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"};
		assertEquals("a***r***e", SortAndStar.twoSort(s));
	}
}