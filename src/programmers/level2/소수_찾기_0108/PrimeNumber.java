package programmers.level2.소수_찾기_0108;

import java.util.HashSet;

// 틀림
public class PrimeNumber {

	HashSet<Integer> set;
	boolean[] visited;
	char[] chars;

	public int solution(String numbers) {
		set = new HashSet<>();
		chars = numbers.toCharArray();
		visited = new boolean[chars.length];

		permutation("", 0);

		return set.size();
	}

	private void permutation(String current, int depth) {
		if (!current.isEmpty()) {
			int num = Integer.parseInt(current);
			if (isPrime(num)) {
				set.add(num);
			}
		}

		if (depth == chars.length) {
			return;
		}

		for (int i = 0; i < chars.length; i++) {
			if (!visited[i]) {
				visited[i] = true;
				permutation(current + chars[i], depth + 1);
				visited[i] = false;
			}
		}
	}

	private boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
