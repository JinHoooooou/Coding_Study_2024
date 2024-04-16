package baekjoon.shortest.알고스팟_0416;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class AlgoSpot {


  private static int[] xPoint = new int[]{0, 0, 1, -1};
  private static int[] yPoint = new int[]{1, -1, 0, 0};

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    int[][] map = makeMap(reader);
    int min = getMin(map);

    writer.write(min + "");

    writer.close();
    reader.close();
  }

  private static int[][] makeMap(BufferedReader reader) throws IOException {
    StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
    int col = Integer.parseInt(tokenizer.nextToken());
    int row = Integer.parseInt(tokenizer.nextToken());
    int[][] result = new int[row][col];

    for (int i = 0; i < row; i++) {
      String oneRow = reader.readLine();
      for (int j = 0; j < col; j++) {
        result[i][j] = oneRow.charAt(j) - '0';
      }
    }
    return result;
  }

  private static int getMin(int[][] map) {
    int row = map.length;
    int col = map[0].length;
    boolean[][] visit = new boolean[row][col];
    int min = Integer.MAX_VALUE;
    PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o[2]));

    queue.add(new int[]{0, 0, 0});
    while (!queue.isEmpty()) {
      int[] current = queue.remove();
      int currentY = current[0];
      int currentX = current[1];

      if (currentY == row - 1 && currentX == col - 1) {
        min = current[2];
        break;
      }

      visit[currentY][currentX] = true;

      for (int i = 0; i < 4; i++) {
        int nextY = currentY + yPoint[i];
        int nextX = currentX + xPoint[i];

        if (nextY < 0 || nextY >= row || nextX < 0 || nextX >= col) {
          continue;
        }

        if (visit[nextY][nextX]) {
          continue;
        }
        queue.add(map[nextY][nextX] == 1 ?
            new int[]{nextY, nextX, current[2] + 1}
            : new int[]{nextY, nextX, current[2]});
      }
    }
    return min;
  }
}
