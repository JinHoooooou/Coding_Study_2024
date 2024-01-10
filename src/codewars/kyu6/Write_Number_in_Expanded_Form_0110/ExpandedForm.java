package codewars.kyu6.Write_Number_in_Expanded_Form_0110;

import java.util.ArrayList;

public class ExpandedForm {
	public static String expandedForm(int num) {
		ArrayList<String> list = new ArrayList<>();
		String strNumber = num + "";
		int length = strNumber.length();

		for (int i = 0; i < length; i++) {
			int value = Integer.parseInt(strNumber.charAt(i) + "") * (int) Math.pow(10, (length - 1 - i));
			if (value != 0) {
				list.add(value + "");
			}
		}


		return String.join(" + ", list.stream().map(String::valueOf).toArray(String[]::new));
	}
}
