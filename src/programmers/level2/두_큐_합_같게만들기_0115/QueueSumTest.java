package programmers.level2.두_큐_합_같게만들기_0115;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class QueueSumTest {

	@Test
	public void test1() {
		int[] queue1 = {3, 2, 7, 2};
		int[] queue2 = {4, 6, 5, 1};

		int expected = 2;
		assertThat(new QueueSum().solution(queue1, queue2)).isEqualTo(expected);
	}

	@Test
	public void test2() {
		int[] queue1 = {1, 2, 1, 2};
		int[] queue2 = {1, 10, 1, 2};

		int expected = 7;
		assertThat(new QueueSum().solution(queue1, queue2)).isEqualTo(expected);
	}

	@Test
	public void test3() {
		int[] queue1 = {1, 1};
		int[] queue2 = {1, 5};

		int expected = -1;
		assertThat(new QueueSum().solution(queue1, queue2)).isEqualTo(expected);
	}
}