package baekjoon.shortest.웜홀_0111;

import baekjoon.tester.Tester;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

class WormholeTest {

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
	public void test() throws IOException {
		String input = """
						2
						3 3 1
						1 2 2
						1 3 4
						2 3 1
						3 1 3
						3 2 1
						1 2 3
						2 3 4
						3 1 8
						""";
		tester.setInput(input);

		Wormhole.main(new String[]{});

		String expected = """
						NO
						YES""";

		assertThat(tester.getOutput()).isEqualTo(expected);
	}

}