package programmers.level2.큰_수_만들기_0709;

public class BigNumber {

  public String solution(String number, int k) {
    StringBuilder result = new StringBuilder();
    int resultLength = number.length() - k;
    int leftIndex = 0;
    int rightIndex = number.length() - resultLength;
    while (result.length() < resultLength) {
      int max = 0;
      for (int i = leftIndex; i <= rightIndex; i++) {
        int target = Character.getNumericValue(number.charAt(i));
        if (target > max) {
          max = target;
          leftIndex = i + 1;
        }
      }
      result.append(max);
      rightIndex++;
    }

    return result.toString();
  }
}
