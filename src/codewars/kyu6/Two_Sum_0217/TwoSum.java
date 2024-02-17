package codewars.kyu6.Two_Sum_0217;

public class TwoSum {

  public static int[] twoSum(int[] numbers, int target) {
    int[] result = new int[2];
    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        if(numbers[i] + numbers[j] == target) {
          return new int[]{i, j};
        }
      }
    }
    return new int[]{};
  }
}
