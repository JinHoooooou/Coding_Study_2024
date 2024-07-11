package programmers.level2.큰_수_만들기_0709;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BigNumberTest {

  @Test
  public void test1() {
    BigNumber bigNumber = new BigNumber();
    assertThat(bigNumber.solution("1924", 2)).isEqualTo("94");
  }

  @Test
  public void test2() {
    BigNumber bigNumber = new BigNumber();
    assertThat(bigNumber.solution("1231234", 3)).isEqualTo("3234");
  }

  @Test
  public void test3() {
    BigNumber bigNumber = new BigNumber();
    assertThat(bigNumber.solution("4177252841", 4)).isEqualTo("775841");
  }
}