package programmers.level2.연속된_부분_수열의_합_0711;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SubSequenceTest {

  @Test
  public void test1() {
    int[] sequence = {1, 2, 3, 4, 5};
    int k = 7;

    assertThat(new SubSequence().solution(sequence, k)).isEqualTo(new int[]{2, 3});
  }

  @Test
  public void test2() {
    int[] sequence = {1, 1, 1, 2, 3, 4, 5};
    int k = 5;

    assertThat(new SubSequence().solution(sequence, k)).isEqualTo(new int[]{6, 6});
  }

  @Test
  public void test3() {
    int[] sequence = {2, 2, 2, 2, 2};
    int k = 6;

    assertThat(new SubSequence().solution(sequence, k)).isEqualTo(new int[]{0, 2});
  }
}