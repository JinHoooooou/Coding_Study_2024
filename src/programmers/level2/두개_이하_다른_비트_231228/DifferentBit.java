package programmers.level2.두개_이하_다른_비트_231228;

// 틀림
public class DifferentBit {
	public long[] solution(long[] numbers) {
		long[] result = new long[numbers.length];
		for (int i = 0; i < result.length; i++) {
			if (numbers[i] % 2 == 0) {
				result[i] = numbers[i] + 1;
				continue;
			}

			String bits = Long.toBinaryString(numbers[i]);
			int zeroIndex = bits.lastIndexOf('0');
			if (zeroIndex != -1) {
				bits = bits.substring(0, zeroIndex) + "10" + bits.substring(zeroIndex + 2);
			} else {
				bits = "10" + bits.substring(1);
			}
			result[i] = Long.parseLong(bits, 2);
		}
		return result;
	}
}
