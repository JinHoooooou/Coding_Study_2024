package codewars.kyu7.Alphabet_war_0105;

import java.util.HashMap;

public class AlphabetWar {
	public static String alphabetWar(String fight) {
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('w', 4);
		map.put('p', 3);
		map.put('b', 2);
		map.put('s', 1);
		map.put('m', -4);
		map.put('q', -3);
		map.put('d', -2);
		map.put('z', -1);
		fight = fight.replaceAll("[^wpbsmqdz]", "");

		int result = 0;
		for (int i = 0; i < fight.length(); i++) {
			result += map.get(fight.charAt(i));
		}
		return result > 0 ? "Left side wins!" : result < 0 ? "Right side wins!" : "Let's fight again!";
	}
}
