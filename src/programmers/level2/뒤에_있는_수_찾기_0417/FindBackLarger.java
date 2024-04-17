package programmers.level2.뒤에_있는_수_찾기_0417;

import java.util.Stack;

public class FindBackLarger {

  public int[] solution(int[] numbers) {
    Stack<Integer> indexStack = new Stack<>();
    int[] result = new int[numbers.length];
    indexStack.add(0);

    for (int i = 1; i < numbers.length; i++) {
      while (!indexStack.isEmpty() && numbers[indexStack.peek()] < numbers[i]) {
        result[indexStack.pop()] = numbers[i];
      }
      indexStack.add(i);
    }

    for (int i = 0; i < result.length; i++) {
      if (result[i] == 0) {
        result[i] = -1;
      }
    }

    return result;
  }
}
