package baekjoon.shortest.숨바꼭질3_0227;

import static org.assertj.core.api.Assertions.assertThat;

import baekjoon.tester.Tester;
import java.io.IOException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HideAndFindTest {

  Tester tester;

  @BeforeEach
  public void setUp() {
    tester = new Tester();
  }

  @AfterEach
  public void tearDown() throws IOException {
    tester.close();
  }


  @Test
  public void test1() throws IOException {
    String input = """
        5 17
        """;
    tester.setInput(input);

    HideAndFind.main(new String[]{});

    String expected = """
        2
        """;
    assertThat(tester.getOutput()).isEqualTo(expected);
  }
}
