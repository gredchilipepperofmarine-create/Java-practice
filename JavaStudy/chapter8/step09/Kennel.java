public class Kennel {
  public static void main (String[] args) {
    // インスタンスを生成して、変数blackで初期化と引数を渡す
    Dog black = new Dog("Kuro", 2);
    System.out.println(black.profile());

    Dog white = new Dog("Shiro", 3);
    System.out.println(white.profile());

    Dog.report();
  }
  
}
