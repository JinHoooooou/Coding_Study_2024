package codewars.kyu7.Maximum_Product_0222;

public class MaxProduct {

  public int adjacentElementsProduct(int[] array) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < array.length - 1; i++) {
      max = Math.max(max, array[i] * array[i + 1]);
    }
    return max;
  }

}
