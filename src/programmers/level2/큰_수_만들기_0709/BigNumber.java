package programmers.level2.큰_수_만들기_0709;

public class BigNumber {

  public String solution(String number, int k) {
    StringBuilder result = new StringBuilder();
    int resultLength = number.length() - k;
    int start = 0;
    while (start < number.length() && result.length() != resultLength) {
      int left = k + result.length() + 1;
      int max = 0;
      for (int j = start; j < left; j++) {
        if (max < number.charAt(j) - '0') {
          max = number.charAt(j) - '0';
          start = j + 1;
        }
      }
      result.append(max);
    }
    return result.toString();
  }
}
