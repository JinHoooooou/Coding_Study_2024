package codewars.kyu7.Greatest_common_divisor_0102;

public class GCD {
	public static int compute(int x, int y) {
		if(Math.min(x,y) == 0) {
			return Math.max(x, y);
		}
		return compute(Math.min(x,y), Math.max(x,y) % Math.min(x,y));
	}
}
