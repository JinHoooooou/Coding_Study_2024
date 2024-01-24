package baekjoon.shortest.파티_0124;

import baekjoon.tester.Tester;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PartyTest {

  @Test
  public void test1() throws IOException {
    Tester tester = new Tester();
    String input = """
            4 8 2
            1 2 4
            1 3 2
            1 4 7
            2 1 1
            2 3 5
            3 1 2
            3 4 4
            4 2 3
            """;
    tester.setInput(input);

    Party.main(new String[]{});

    String actual = tester.getOutput();
    assertThat(actual).isEqualTo("10");

  }
}