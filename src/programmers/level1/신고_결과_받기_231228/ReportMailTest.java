package programmers.level1.신고_결과_받기_231228;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReportMailTest {
	@Test
	public void test1() {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
		int k = 2;

		int[] expected = {2, 1, 1, 0};
		assertArrayEquals(expected, new ReportMail().solution(id_list, report, k));
	}

	@Test
	public void test2() {
		String[] id_list = {"con", "ryan"};
		String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
		int k = 3;

		int[] expected = {0, 0};
		assertArrayEquals(expected, new ReportMail().solution(id_list, report, k));
	}

}