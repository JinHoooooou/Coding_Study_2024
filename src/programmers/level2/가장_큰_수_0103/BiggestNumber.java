package programmers.level2.가장_큰_수_0103;

import java.util.Arrays;

// 틀림
public class BiggestNumber {
	public String solution(int[] numbers) {
		String[] strNumbers = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
		Arrays.sort(strNumbers, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

		return String.join("", strNumbers);
	}
}
