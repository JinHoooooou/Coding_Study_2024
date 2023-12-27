package codewars.kyu6.Count_characters_in_your_strings_231227;

import java.util.HashMap;
import java.util.Map;

public class CountChar {

	public static Map<Character, Integer> count(String str) {
		Map<Character, Integer> result = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			result.put(str.charAt(i), result.getOrDefault(str.charAt(i), 0) + 1);
		}
		return result;
	}
}
