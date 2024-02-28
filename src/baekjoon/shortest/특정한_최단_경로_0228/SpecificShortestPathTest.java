package baekjoon.shortest.특정한_최단_경로_0228;

import static org.assertj.core.api.Assertions.assertThat;

import baekjoon.tester.Tester;
import java.io.IOException;
import org.junit.jupiter.api.Test;

class SpecificShortestPathTest {

  @Test
  public void test() throws IOException {
    Tester tester = new Tester();
    String input = """
        4 6
        1 2 3
        2 3 3
        3 4 1
        1 3 5
        2 4 5
        1 4 4
        2 3
        """;
    tester.setInput(input);

    SpecificShortestPath.main(new String[]{});

    String actual = tester.getOutput();
    assertThat(actual).isEqualTo("7");
  }
}
