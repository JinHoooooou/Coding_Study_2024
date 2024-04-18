package codewars.kyu6.Valid_Braces_0418;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BraceCheckerTest {

  @Test
  public void test1() {
    // Given
    String braces = "(){}[]";

    // When
    boolean actual = new BraceChecker().isValid(braces);

    // Then
    assertThat(actual).isTrue();
  }

  @Test
  public void test2() {
    // Given
    String braces = "([{}])";

    // When
    boolean actual = new BraceChecker().isValid(braces);

    // Then
    assertThat(actual).isTrue();
  }

  @Test
  public void test3() {
    // Given
    String braces = "(}";

    // When
    boolean actual = new BraceChecker().isValid(braces);

    // Then
    assertThat(actual).isFalse();
  }

  @Test
  public void test4() {
    // Given
    String braces = "[(])";

    // When
    boolean actual = new BraceChecker().isValid(braces);

    // Then
    assertThat(actual).isFalse();
  }
  @Test
  public void test5() {
    // Given
    String braces = "[({})](]";

    // When
    boolean actual = new BraceChecker().isValid(braces);

    // Then
    assertThat(actual).isFalse();
  }
}