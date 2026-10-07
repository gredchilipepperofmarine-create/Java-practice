class PracticeUpd {
  public static void main (String[] args) {

    int num = 2;
    int n = 30;
    int result = 1;

    for (int i = 1; i <= n; i++) {
      result *= num;
      if (result <= 1000) {
        System.out.println(num + "の" + i + "乗は" + result);
      }  
    }
  }
}