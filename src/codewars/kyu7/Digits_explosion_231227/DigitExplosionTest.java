package codewars.kyu7.Digits_explosion_231227;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitExplosionTest {

	@Test
	public void test() {
		assertEquals("333122", DigitExplosion.explode("312"));
		assertEquals("12222666666999999999", DigitExplosion.explode("102269"));
		assertEquals("", DigitExplosion.explode("0"));
		assertEquals("", DigitExplosion.explode("00"));
	}
}