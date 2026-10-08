import java.util.*;

public class Rand {
  public static void main (String[] args) {

    int[][] test = new int[10][10];

    for (int i = 0; i < test.length; i++) {
      for (int j = 0; j < test[i].length; j++) {
        int col = (int)((Math.random()*6)+1);
        test[i][j] = col;
        if(test[i][j-1] > test[i][j]) {
          int tmp = test[i][j-1];
          test[i][j-1] = test[i][j];
          test[i][j] = tmp;
        }
        // System.out.print(col + " ");
      }
      // System.out.println();
    }

    // Arrays.sort(test);

    for (int[] row:test) {
      // Arrays.sort(row)
      for (int col: row) {
        // col = (int)((Math.random()*6)+1);
        System.out.print(col + " ");
      }
      System.out.println();
    }
  }
}
