package programmers.level2.큰_수_만들기_0709;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BigNumberTest {

  @Test
  public void test1() {
    BigNumber bigNumber = new BigNumber();
    assertThat(bigNumber.solution("1924", 2)).isEqualTo("94");
  }
}