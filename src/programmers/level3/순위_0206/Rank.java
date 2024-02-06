package programmers.level3.순위_0206;

// 틀림
public class Rank {

  public int solution(int n, int[][] results) {
    int[][] maps = new int[n + 1][n + 1];

    for (int i = 0; i < results.length; i++) {
      int winner = results[i][0];
      int loser = results[i][1];
      maps[winner][loser] = 1;
      maps[loser][winner] = -1;
    }

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        for (int k = 1; k <= n; k++) {
          if (maps[i][j] == 1 && maps[j][k] == 1) {
            maps[i][k] = 1;
            maps[k][i] = -1;
          }
          if (maps[i][j] == -1 && maps[j][k] == -1) {
            maps[i][k] = -1;
            maps[k][i] = 1;
          }
        }
      }
    }

    int result = 0;
    for (int i = 1; i <= n; i++) {
      int count = 0;
      for (int j = 1; j <= n; j++) {
        if (maps[i][j] != 0) {
          count++;
        }
      }
      if (count == n - 1) {
        result++;
      }
    }

    return result;
  }
}
