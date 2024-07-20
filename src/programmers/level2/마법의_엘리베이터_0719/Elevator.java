package programmers.level2.마법의_엘리베이터_0719;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class Elevator {

  public int solution(int storey) {
    int result = 0;
    Stack<Integer> stack = Arrays
        .stream(String.valueOf(storey).split(""))
        .map(Integer::parseInt)
        .collect(Collectors.toCollection(Stack::new));
    boolean up = false;

    while (!stack.isEmpty()) {
      int pop = stack.pop();
      if (pop == 9 && up) {
        continue;
      }
      pop = up ? pop + 1 : pop;

      if (pop > 5) {
        up = true;
        result += (10 - pop);
      } else if (pop == 5 && !stack.isEmpty()) {
        int next = stack.peek();
        up = next >= 5;
        result += pop;
      } else {
        up = false;
        result += pop;
      }
    }

    return up ? result + 1 : result;
  }

  public int bestSolution(int storey) {
    int result = 0;
    while (storey != 0) {
      int oneDigit = storey % 10;
      int tenDigit = (storey / 10) % 10;
      if (oneDigit > 5) {
        result += (10 - oneDigit);
        storey += 10;
      } else if (oneDigit == 5) {
        result += oneDigit;
        storey = tenDigit >= 5 ? storey + 10 : storey;
      } else {
        result += oneDigit;
      }
      storey /= 10;
    }
    return result;
  }
}
