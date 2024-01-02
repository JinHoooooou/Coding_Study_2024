package codewars.kyu8.Find_Multiples_of_a_Number_0102;

import java.util.stream.IntStream;

public class Multiples {

	public static int[] find(int base, int limit) {
		return IntStream.rangeClosed(1, limit).filter(x->x%base == 0).toArray();
	}
}
