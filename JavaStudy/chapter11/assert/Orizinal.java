public class Orizinal {
  
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
    for(int i=0; i<args.length; i++){
      try {
        // コマンドライン引数で渡された整数が、素数かどうかを判定
          int n = Integer.parseInt(args[i]);
          System.out.printf("%d %s a prime number\n", n, prime(n)?"is":"is not");
      } catch (Exception e) {
        System.out.printf("usage: java Assert <integer> at %s", args[i]);
      }
    }
  }
}
