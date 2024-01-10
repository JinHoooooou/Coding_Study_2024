package baekjoon.shortest.최소비용_구하기_0109;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class MinWeightTest {

	ByteArrayInputStream in;
	ByteArrayOutputStream out;

	@BeforeEach
	public void setUp() {
		out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
	}

	@AfterEach
	public void setOut() {
		System.setOut(System.out);
		System.setIn(System.in);
	}

	@Test
	public void test() throws IOException {
		String input = """
						5
						8
						1 2 2
						1 3 3
						1 4 1
						1 5 10
						2 4 2
						3 4 1
						3 5 1
						4 5 3
						1 5
						""";
		in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);

		MinWeight.main(new String[]{});
		String expected = """
						4
						""";

		assertThat(out.toString()).isEqualTo(expected);
	}
}