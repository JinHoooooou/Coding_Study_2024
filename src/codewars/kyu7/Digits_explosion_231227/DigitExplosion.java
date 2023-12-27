package codewars.kyu7.Digits_explosion_231227;

public class DigitExplosion {
	public static String explode(String digits) {
		String result = "";
		for (int i = 0; i < digits.length(); i++) {
			result += (digits.charAt(i) + "").repeat(digits.charAt(i) - '0');
		}
		return result;
	}
}
