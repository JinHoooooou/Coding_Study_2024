package codewars.kyu7.Build_a_square_0110;

public class Square {
	public static final String generateShape(int n) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < n; i++) {
			result.append("+".repeat(n)).append("\n");
		}
		return result.toString().trim();
	}
}
