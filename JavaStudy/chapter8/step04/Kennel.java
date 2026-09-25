public class Kennel {
  public static void main(String[] args) {
    // Dogインスタンスを生成して変数Blackを初期化し、
    // pofileメソッドを呼び出して情報を出力
    Dog black = new Dog("Kuro", 2);
    System.out.println(black.profile());

    Dog white = new Dog("Shiro", 3);
    System.out.println(white.profile());
  }
  
}
