package codewars.kyu6.Consecutive_strings_0105;

public class LongestConsec {

	public static String longestConsec(String[] strarr, int k) {

		String result = "";

		for (int i = 0; i <= strarr.length - k; i++) {
			StringBuilder concat = new StringBuilder();
			for (int j = i; j < i + k; j++) {
				concat.append(strarr[j]);
			}
			if (concat.length() > result.length()) {
				result = concat.toString();
			}
		}

		return result;
	}
}
