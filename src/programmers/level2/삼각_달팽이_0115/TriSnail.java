package programmers.level2.삼각_달팽이_0115;

import java.util.ArrayList;
import java.util.Arrays;

public class TriSnail {
	public int[] solution(int n) {
		if (n == 1) {
			return new int[]{1};
		}
		int[][] result = new int[n][];
		for (int i = 0; i < n; i++) {
			result[i] = new int[i + 1];
		}

		int value = 1;
		for (int i = 0; i < Math.ceil(n / (double) 3); i++) {
			//내려가
			for (int j = (i * 2); j < n - i; j++) {
				result[j][i] = value++;
			}
			//오른쪽
			value--;
			for (int j = i; j < n - (i * 2); j++) {
				result[(n - 1) - i][j] = value++;
			}
			value--;
			//올라가
			for (int j = i; j < (n - 1) - (i * 2); j++) {
				result[(n - 1) - j][(n - 1) - (i * 2) - j + i] = value++;
			}
		}
		return Arrays.stream(result).flatMapToInt(Arrays::stream).toArray();
	}

	public int[] solution2(int n) {
		int[][] copy = new int[n][n];
		int y = -1;
		int x = 0;
		int value = 1;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (i % 3 == 0) {
					y++;
				} else if (i % 3 == 1) {
					x++;
				} else {
					x--;
					y--;
				}
				copy[y][x] = value++;
			}
		}

		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (copy[i][j] == 0) {
					continue;
				}
				result.add(copy[i][j]);
			}
		}

		return result.stream().mapToInt(Integer::valueOf).toArray();
	}
}
