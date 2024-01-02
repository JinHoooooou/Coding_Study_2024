package codewars.kyu6.Which_are_in_0102;

import java.util.HashSet;

public class WhichAreIn {
	public static String[] inArray(String[] array1, String[] array2) {
		HashSet<String> set = new HashSet<>();

		for (int i = 0; i < array1.length; i++) {
			String target = array1[i];
			for (int j = 0; j < array2.length; j++) {
				if (array2[j].contains(target)) {
					set.add(target);
					break;
				}
			}
		}
		return set.stream().sorted().toArray(String[]::new);
	}
}
