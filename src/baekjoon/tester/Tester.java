package baekjoon.tester;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Tester {
	private ByteArrayInputStream in;
	private ByteArrayOutputStream out;

	public Tester() {
		in = new ByteArrayInputStream(new byte[]{});
		out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
	}

	public void close() throws IOException {
		out.close();
		in.close();
		System.setOut(System.out);
		System.setIn(System.in);
	}

	public void setInput(String input) throws IOException {
		in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
	}

	public String getOutput() {
		return out.toString();
	}
}
