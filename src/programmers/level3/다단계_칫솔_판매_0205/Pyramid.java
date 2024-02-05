package programmers.level3.다단계_칫솔_판매_0205;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

// 틀림
public class Pyramid {

  public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
    Map<String, Integer> index = new HashMap<>();
    Map<String, String> managers = new HashMap<>();
    for (int i = 0; i < enroll.length; i++) {
      managers.put(enroll[i], referral[i]);
      index.put(enroll[i], i);
    }
    return bfs(enroll, seller, amount, managers, index);
  }

  private static int[] bfs(String[] enroll, String[] seller, int[] amount,
      Map<String, String> managers, Map<String, Integer> index) {
    Queue<Object[]> queue = new LinkedList<>();
    for (int i = 0; i < seller.length; i++) {
      queue.add(new Object[]{seller[i], amount[i] * 100});
    }

    int[] result = new int[enroll.length];
    while (!queue.isEmpty()) {
      Object[] current = queue.remove();
      String target = String.valueOf(current[0]);
      int income = (int) current[1];

      String manager = managers.get(target);
      int managerBonus = income / 10;

      result[index.get(target)] += (income-managerBonus);

      if (!manager.equals("-") && managerBonus >= 1) {
        queue.add(new Object[]{manager, managerBonus});
      }
    }
    return result;
  }
}
