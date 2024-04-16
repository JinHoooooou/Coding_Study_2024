package baekjoon.shortest.알고스팟_0416;

import static org.assertj.core.api.Assertions.assertThat;

import baekjoon.tester.Tester;
import java.io.IOException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlgoSpotTest {

  Tester tester;

  @BeforeEach
  public void setup() {
    tester = new Tester();
  }

  @AfterEach
  public void teardown() throws IOException {
    tester.close();
  }

  @Test
  public void test1() throws IOException {
    String input = """
        3 3
        011
        111
        110
        """;
    tester.setInput(input);

    AlgoSpot.main(new String[]{});

    String expected = "3" ;

    assertThat(tester.getOutput()).isEqualTo(expected);
  }

  @Test
  public void test2() throws IOException {
    String input = """
        4 2
        0001
        1000
        """;
    tester.setInput(input);

    AlgoSpot.main(new String[]{});

    String expected = "0" ;

    assertThat(tester.getOutput()).isEqualTo(expected);
  }

  @Test
  public void test3() throws IOException {
    String input = """
        6 6
        001111
        010000
        001111
        110001
        011010
        100010
        """;
    tester.setInput(input);

    AlgoSpot.main(new String[]{});

    String expected = "2" ;

    assertThat(tester.getOutput()).isEqualTo(expected);
  }
}
