class Kuku {
  public static void main (String[] args) {

    int left = 9;
    int right = 9;

    for (int i = 1; i <= left; i++) {
      for (int j = 1; j <= right; j++) {
        int result = 1;
        result = i * j;
        System.out.printf("%d × %d = %2d  ", i, j, result);
      }
      System.out.println("");
    }
  }
}