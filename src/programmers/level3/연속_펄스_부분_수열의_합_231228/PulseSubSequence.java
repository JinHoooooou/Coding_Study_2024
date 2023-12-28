package programmers.level3.연속_펄스_부분_수열의_합_231228;

public class PulseSubSequence {
	public long solution(int[] sequence) {
		long[] dpPlusPulse = new long[sequence.length];
		long[] dpMinusPulse = new long[sequence.length];
		dpPlusPulse[0] = sequence[0];
		dpMinusPulse[0] = -sequence[0];
		long max = Math.max(dpPlusPulse[0], dpMinusPulse[0]);

		for (int i = 1; i < sequence.length; i++) {
			dpPlusPulse[i] = Math.max(dpMinusPulse[i - 1] + sequence[i], sequence[i]);
			dpMinusPulse[i] = Math.max(dpPlusPulse[i - 1] - sequence[i], -sequence[i]);

			max = Math.max(max, Math.max(dpPlusPulse[i], dpMinusPulse[i]));
		}

		return max;
	}
}
