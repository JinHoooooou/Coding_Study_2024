package programmers.level2.쿼드압축_후_개수_세기_0103;

import java.util.Arrays;

public class QuadCompress {
	int[] result;

	public int[] solution(int[][] arr) {
		result = new int[2];

		compress(arr, 0, arr.length, 0, arr.length);

		return result;
	}

	private void compress(int[][] arr, int rowStartInclusive, int rowEndExclusive, int colStartInclusive, int colEndExclusive) {
		int length = rowEndExclusive - rowStartInclusive;
		int[][] subArray = copySubArray(arr, rowStartInclusive, rowEndExclusive, colStartInclusive, colEndExclusive, length);
		if (subArray.length == 1) {
			result[subArray[0][0]]++;
			return;
		}

		if (isFull(subArray, 0)) {
			result[0]++;
		} else if (isFull(subArray, 1)) {
			result[1]++;
		} else {
			compress(subArray, 0, length / 2, 0, length / 2);
			compress(subArray, 0, length / 2, length / 2, length);
			compress(subArray, length / 2, length, 0, length / 2);
			compress(subArray, length / 2, length, length / 2, length);
		}
	}

	private int[][] copySubArray(int[][] arr, int rowStartInclusive, int rowEndExclusive, int colStartInclusive, int colEndExclusive, int length) {
		int[][] subArray = new int[length][length];
		int rowIndex = 0;
		int colIndex = 0;
		for (int i = rowStartInclusive; i < rowEndExclusive; i++) {
			colIndex = 0;
			for (int j = colStartInclusive; j < colEndExclusive; j++) {
				subArray[rowIndex][colIndex++] = arr[i][j];
			}
			rowIndex++;
		}
		return subArray;
	}

	private boolean isFull(int[][] subArray, int bit) {
		int bitCount = (int) Arrays.stream(subArray).flatMapToInt(Arrays::stream).filter(x -> x == bit).count();
		return bitCount == (subArray.length * subArray.length);
	}
}
