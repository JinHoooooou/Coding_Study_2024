package codewars.kyu6.Write_Number_in_Expanded_Form_0110;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class ExpandedFormTest {
	@Test
	public void test1() {
		int num = 12;
		String expected = "10 + 2";

		assertThat(ExpandedForm.expandedForm(num)).isEqualTo(expected);
	}

	@Test
	public void test2() {
		int num = 70304;
		String expected = "70000 + 300 + 4";

		assertThat(ExpandedForm.expandedForm(num)).isEqualTo(expected);
	}
}