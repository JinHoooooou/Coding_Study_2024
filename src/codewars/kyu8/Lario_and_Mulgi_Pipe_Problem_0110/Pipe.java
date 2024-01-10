package codewars.kyu8.Lario_and_Mulgi_Pipe_Problem_0110;

import java.util.stream.IntStream;

public class Pipe {

	public static int[] pipeFix(int[] numbers) {
		return IntStream.rangeClosed(numbers[0], numbers[numbers.length-1]).toArray();
	}
}
