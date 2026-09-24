public class JaggedArray3 {
  public static void main (String[] args) {
    // ジャグ配列を宣言し、１次元目の配列を生成
    int[][] table = new int [9][];
    // １次元目の配列をどのように繰り返すか(９個の行を生成する)
    for(int i = 0; i < table.length; i++){
      // 生成された９個の各行に対して空の列を生成
      table[i] = new int[i+1];
      //列は０個から生成されるから、最初はi+1で列1を作り、繰り返しの中で2個3個と増えていく
      for(int j = 0; j < table[i].length; j++){
        // 生成した行と列に対して数値を入れる
        table[i][j] = (i+1)*(j+1);
      }
    }

    for(int[] row: table){
      for(int col: row){
        System.out.printf("%2d ", col);
      }
      System.out.println();
    }
  }
  
}
