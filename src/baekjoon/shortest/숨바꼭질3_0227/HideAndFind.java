// 틀림
package baekjoon.shortest.숨바꼭질3_0227;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class HideAndFind {

  static int min = Integer.MAX_VALUE;

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

    int source = Integer.parseInt(tokenizer.nextToken());
    int destination = Integer.parseInt(tokenizer.nextToken());

    Queue<int[]> queue = new LinkedList<>();
    queue.add(new int[]{source, 0});
    boolean[] visit = new boolean[10001];

    while (!queue.isEmpty()) {
      int[] current = queue.remove();
      int currentPosition = current[0];
      int currentCost = current[1];

      if (currentPosition == destination) {
        min = Math.min(min, currentCost);
        continue;
      }
      if (visit[currentPosition]) {
        continue;
      }
      visit[currentPosition] = true;

      if (currentPosition - 1 >= 0 && !visit[currentPosition - 1]) {
        queue.add(new int[]{currentPosition - 1, currentCost + 1});
      }
      if (currentPosition + 1 < 10001 && !visit[currentPosition + 1]) {
        queue.add(new int[]{currentPosition + 1, currentCost + 1});
      }
      if (currentPosition * 2 < 10001 && !visit[currentPosition * 2]) {
        queue.add(new int[]{currentPosition * 2, currentCost});
      }
    }

    writer.write(min+"\n");
    writer.flush();
  }
}
