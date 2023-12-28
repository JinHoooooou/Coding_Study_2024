package programmers.level2.택배상자_231228;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Parcel {
	public int solution(int[] order) {
		int count = 0;
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < order.length; i++) {
			queue.add(i + 1);
		}
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < order.length; i++) {
			int target = order[i];
			if (!stack.isEmpty() && stack.peek() == target) {
				stack.pop();
				count++;
				continue;
			}
			while (!queue.isEmpty() && queue.peek() < target) {
				int poll = queue.remove();
				stack.add(poll);
			}
			if (!queue.isEmpty() && queue.peek() == target) {
				queue.remove();
				count++;
			} else {
				break;
			}
		}
		return count;
	}

	public int solution2(int[] order) {
		Stack<Integer> stack = new Stack<>();
		int count = 0;

		for (int i = 0; i < order.length; i++) {
			int current = i + 1;

			stack.add(current);
			while (!stack.isEmpty()) {
				if (stack.peek() != order[count]) {
					break;
				}
				stack.pop();
				count++;
			}

		}
		return count;
	}
}
