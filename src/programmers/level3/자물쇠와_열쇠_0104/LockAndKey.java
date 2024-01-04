package programmers.level3.자물쇠와_열쇠_0104;

// 틀림
public class LockAndKey {


	public boolean solution(int[][] key, int[][] lock) {
		int lockLength = lock.length;

		for (int rotateCount = 0; rotateCount < 4; rotateCount++) {
			key = rotate(key, rotateCount);
			int[][] paddedKey = padding(key, lockLength);
			for (int keyRow = 0; keyRow < paddedKey.length - lock.length - 1; keyRow++) {
				for (int keyCol = 0; keyCol < paddedKey.length - lock.length - 1; keyCol++) {
					if (isValid(lock, paddedKey, keyRow, keyCol)) {
						return true;
					}
				}
			}

		}
		return false;
	}

	private static boolean isValid(int[][] lock, int[][] paddedKey, int row, int col) {
		for (int i = 0; i < lock.length; i++) {
			for (int j = 0; j < lock.length; j++) {
				if (lock[i][j] + paddedKey[row + i][col + j] != 1) {
					return false;
				}
			}
		}
		return true;
	}

	private int[][] padding(int[][] array, int length) {
		int[][] result = new int[array.length * length - 2][array.length * length - 2];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				result[i + length - 1][j + length - 1] = array[i][j];
			}
		}
		return result;
	}


	public int[][] rotate(int[][] key, int rotateCount) {
		if (rotateCount == 0) {
			return key;
		}
		int[][] result = new int[key.length][key.length];
		for (int i = 0; i < rotateCount; i++) {
			for (int j = 0; j < key.length; j++) {
				for (int k = 0; k < key.length; k++) {
					result[k][key.length - 1 - j] = key[j][k];
				}
			}
		}

		return result;
	}
}
