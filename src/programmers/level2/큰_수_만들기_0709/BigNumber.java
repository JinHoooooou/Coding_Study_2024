package programmers.level2.큰_수_만들기_0709;

import java.util.Stack;

public class BigNumber {

  public String solution(String number, int k) {
    StringBuilder result = new StringBuilder();
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < number.length(); i++) {
      char digit = number.charAt(i);
      while (!stack.isEmpty() && k > 0 && digit > stack.peek()) {
        stack.pop();
        k--;
      }
      stack.push(digit);
    }

    while (!stack.isEmpty()) {
      result.append(stack.pop());
    }

    return result.reverse().toString();
  }
}
