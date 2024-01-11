package baekjoon.shortest.타임머신_0111;

import baekjoon.tester.Tester;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

class TimeMachineTest {

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
						3 4
						1 2 4
						1 3 3
						2 3 -4
						3 1 -2
									""";

		tester.setInput(input);

		TimeMachine.main(new String[]{});
		String expected = """
						-1
						""";
	}


	@Test
	public void test2() throws IOException {
		String input = """
						3 4
						1 2 4
						1 3 3
						2 3 -1
						3 1 -2
									 """;
		tester.setInput(input);

		TimeMachine.main(new String[]{});

		String expected = """
						4
						3""";
		assertThat(tester.getOutput()).isEqualTo(expected);
	}

	@Test
	public void test3() throws IOException {
		String input = """
						3 2
						1 2 4
						1 2 3
									""";
		tester.setInput(input);

		TimeMachine.main(new String[]{});

		String expected = """
						3
						-1""";
		assertThat(tester.getOutput()).isEqualTo(expected);
	}
}