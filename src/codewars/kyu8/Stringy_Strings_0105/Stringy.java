package codewars.kyu8.Stringy_Strings_0105;

public class Stringy {
	public static String stringy(int size) {
		return "10".repeat(size/2) + (size % 2 == 1 ? "1" : "");
	}
}
