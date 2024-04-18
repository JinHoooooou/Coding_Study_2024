package codewars.kyu6.Valid_Braces_0418;

import java.util.Stack;

public class BraceChecker {

  public boolean isValid(String braces) {
    Stack<Character> openBraceStack = new Stack<>();

    for (char brace : braces.toCharArray()) {
      if (!openBraceStack.isEmpty() && isMatchedBrace(openBraceStack.peek(), brace)) {
        openBraceStack.pop();
      } else {
        openBraceStack.push(brace);
      }
    }

    return openBraceStack.isEmpty();
  }

  private boolean isMatchedBrace(Character open, char close) {
    return (open == '(' && close == ')')
        || (open == '{' && close == '}')
        || (open == '[' && close == ']');
  }
}
