package programmers.level2.두_큐_합_같게만들기_0115;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueSum {
	public int solution(int[] queue1, int[] queue2) {
		Queue<Integer> qu1 = new LinkedList<>();
		Queue<Integer> qu2 = new LinkedList<>();
		long qu1Sum = Arrays.stream(queue1).sum();
		long qu2Sum = Arrays.stream(queue2).sum();
		for (int i = 0; i < queue1.length; i++) {
			qu1.add(queue1[i]);
			qu2.add(queue2[i]);
		}
		if ((qu1Sum + qu2Sum) % 2 != 0) {
			return -1;
		}

		int swapCount = 0;
		while (qu1Sum != qu2Sum) {
			if (swapCount > queue1.length * 4) {
				return -1;
			}
			if (qu1Sum > qu2Sum) {
				qu1Sum -= qu1.element();
				qu2Sum += qu1.element();
				qu2.add(qu1.remove());
			} else {
				qu1Sum += qu2.element();
				qu2Sum -= qu2.element();
				qu1.add(qu2.remove());
			}
			swapCount++;
		}

		return swapCount;
	}
}
