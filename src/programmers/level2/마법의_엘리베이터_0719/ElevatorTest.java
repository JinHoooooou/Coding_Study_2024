package programmers.level2.마법의_엘리베이터_0719;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ElevatorTest {

  @Test
  public void test1() {
    int storey = 16;
    int expected = 6;

    assertThat(new Elevator().solution(storey)).isEqualTo(expected);
  }

  @Test
  public void test2() {
    int storey = 2554;
    int expected = 16;

    assertThat(new Elevator().solution(storey)).isEqualTo(expected);
  }

  @Test
  public void test3() {
    int storey = 2756;
    int expected = 13;

    assertThat(new Elevator().solution(storey)).isEqualTo(expected);
  }

  @Test
  public void test4() {
    int storey = 6756;
    int expected = 14;

    assertThat(new Elevator().solution(storey)).isEqualTo(expected);
  }

  @Test
  public void test5() {
    int storey = 6956;
    int expected = 12;

    assertThat(new Elevator().solution(storey)).isEqualTo(expected);
  }

  @Test
  public void test6() {
    int storey = 99;
    int expected = 2;

    assertThat(new Elevator().solution(storey)).isEqualTo(expected);
  }

  @Test
  public void test7() {
    int storey = 545;
    int expected = 14;

    assertThat(new Elevator().solution(storey)).isEqualTo(expected);
  }

  @Test
  public void test8() {
    int storey = 555;
    int expected = 14;

    assertThat(new Elevator().solution(storey)).isEqualTo(expected);
  }
}