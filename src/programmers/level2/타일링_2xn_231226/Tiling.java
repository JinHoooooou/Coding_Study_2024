package programmers.level2.타일링_2xn_231226;

import java.util.Scanner;

public class Tiling {

	public int solution(int n) {
		if (n == 2) {
			return 2;
		}
		if (n == 3) {
			return 3;
		}
		int a = 2;
		int b = 3;
		int result = 0;
		for (int i = 1; i < n - 2; i++) {
			result = (b + a) % 1000000007;
			a = b % 1000000007;
			b = result % 1000000007;
		}

		Scanner scanner = new Scanner(System.in);
		return result % 1000000007;

	}

}
