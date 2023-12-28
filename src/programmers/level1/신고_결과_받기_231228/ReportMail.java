package programmers.level1.신고_결과_받기_231228;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ReportMail {
	public int[] solution(String[] idList, String[] report, int k) {
		report = Arrays.stream(report).distinct().toArray(String[]::new);
		ArrayList<String> banList = getBanList(idList, report, k);

		HashMap<String, String> reportMap = new HashMap<>();
		for (int i = 0; i < report.length; i++) {
			String reporter = report[i].split(" ")[0];
			String reported = report[i].split(" ")[1];

			reportMap.put(reporter, reportMap.getOrDefault(reporter, "") + reported + " ");
		}


		int[] result = new int[idList.length];
		for (int i = 0; i < idList.length; i++) {
			String target = idList[i];
			String[] reportList = reportMap.getOrDefault(target, " ").split(" ");
			for (String reported : reportList) {
				if (banList.contains(reported)) {
					result[i]++;
				}
			}
		}


		return result;
	}

	private ArrayList<String> getBanList(String[] idList, String[] report, int k) {
		HashMap<String, Integer> reportedCount = new HashMap<>();
		for (int i = 0; i < report.length; i++) {
			String reported = report[i].split(" ")[1];
			reportedCount.put(reported, reportedCount.getOrDefault(reported, 0) + 1);
		}

		ArrayList<String> banList = new ArrayList<>();
		for (String target : reportedCount.keySet()) {
			int count = reportedCount.getOrDefault(target, 0);
			if (count >= k) {
				banList.add(target);
			}
		}
		return banList;
	}
}
