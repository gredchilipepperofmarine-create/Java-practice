class Practice {
  public static void main (String[] args) {

    int num = 2;
    int n = 30;

    for (int i = 1; i <= n; i++) {
      int result = 1;
      for (int j = 1; j <= i; j++) {
        result *= num;  
      }
      System.out.println(num + "の" + i + "乗は" + result);
    }
  }
}