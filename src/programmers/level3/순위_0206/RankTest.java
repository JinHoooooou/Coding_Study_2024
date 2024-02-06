package programmers.level3.순위_0206;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class RankTest {

  @Test
  public void test() {
    int n = 5;
    int[][] results = {
        {4, 3},
        {4, 2},
        {3, 2},
        {1, 2},
        {2, 5}
    };

    int expected = 2;

    assertThat(new Rank().solution(n, results)).isEqualTo(expected);
  }
}
