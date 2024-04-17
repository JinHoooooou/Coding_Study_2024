package programmers.level2.뒤에_있는_수_찾기_0417;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FindBackLargerTest {

  @Test
  public void test1() {
    int[] numbers = {2, 3, 3, 5};

    int[] actual = new FindBackLarger().solution(numbers);

    assertThat(actual).isEqualTo(new int[]{3, 5, 5, -1});
  }
}
