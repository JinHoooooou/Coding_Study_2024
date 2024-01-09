package programmers.level3.풍선_터트리기_0109;

// 틀림
public class Balloon {
	public int solution(int[] a) {
		int length = a.length;

		int[] leftMins = new int[length];
		int[] rightMins = new int[length];
		leftMins[0] = a[0];
		rightMins[length - 1] = a[length - 1];

		for (int i = 1; i < length; i++) {
			leftMins[i] = Math.min(leftMins[i - 1], a[i]);
			rightMins[length - 1 - i] = Math.min(rightMins[length - i], a[length - 1 - i]);
		}

		int count = 0;
		for (int i = 0; i < length; i++) {
			if (a[i] > leftMins[i] && a[i] > rightMins[i]) {
				count++;
			}
		}
		return length - count;
	}
}
