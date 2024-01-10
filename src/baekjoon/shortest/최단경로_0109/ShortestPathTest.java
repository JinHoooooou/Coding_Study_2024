package baekjoon.shortest.최단경로_0109;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;


class ShortestPathTest {

	ByteArrayInputStream in;
	ByteArrayOutputStream out;

	@BeforeEach
	public void setUp() {
		out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
	}

	@AfterEach
	public void tearDown() {
		System.setIn(System.in);
		System.setOut(System.out);
	}

	@Test
	public void test() throws IOException {
		String input = """
						5 6
						1
						5 1 1
						1 2 2
						1 3 3
						2 3 4
						2 4 5
						3 4 6""";
		in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);

		ShortestPath.main(new String[]{});

		String expected = """
						0
						2
						3
						7
						INF
						""";
		assertThat(out.toString()).isEqualTo(expected);
	}
}