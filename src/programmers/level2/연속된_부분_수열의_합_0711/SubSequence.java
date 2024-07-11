package programmers.level2.연속된_부분_수열의_합_0711;

public class SubSequence {

  public int[] solution(int[] sequence, int k) {
    int[] result = new int[]{0, sequence.length - 1};
    int left = 0;
    int right = 1;

    int sum = sequence[0];

    while (left < right) {
      if (sum == k) {
        int beforeShortestLength = result[1] - result[0];
        int currentLength = right - left - 1;
        if (currentLength < beforeShortestLength) {
          result[0] = left;
          result[1] = right - 1;
        }
        sum -= sequence[left++];
      } else if (sum > k) {
        sum -= sequence[left++];
      } else if (right < sequence.length) {
        sum += sequence[right++];
      } else {
        break;
      }
    }

    return result;
  }

}
