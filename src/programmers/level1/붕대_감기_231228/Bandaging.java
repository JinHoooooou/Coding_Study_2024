package programmers.level1.붕대_감기_231228;


public class Bandaging {
	public int solution(int[] bandage, int health, int[][] attacks) {
		int currentTime = attacks[0][0];
		int maxHealth = health;
		health -= attacks[0][1];
		if (health < 0) {
			return -1;
		}
		for (int i = 1; i < attacks.length; i++) {
			int healTime = (attacks[i][0] - currentTime) - 1;

			int healAmount = bandage[1] * healTime + ((healTime / bandage[0]) * bandage[2]);
			health = Math.min(maxHealth, health + healAmount);

			health -= attacks[i][1];

			if (health <= 0) {
				return -1;
			}

			currentTime = attacks[i][0];
		}


		return health;
	}
}
