public class Assert {
  
  // 整数nが素数ならtrueを返すメソッド
  public static boolean prime(int n) {
    for (int i=2; i<n; i++) {
      if(n%i == 0) {
        return false;
      }
    }
    return n>=2;
  }

  public static void main (String[] args) {
    // コマンドライン引数で渡された整数が、素数かどうかを判定
    int n = Integer.parseInt(args[0]);
    try {
      System.out.printf("%d %s a prime number\n", n, prime(n)?"is":"is not");
    } catch (Exception e) {
      System.out.println("usage: java Assert <integer>");
    }
  }
}
