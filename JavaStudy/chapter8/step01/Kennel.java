public class Kennel {
  public static void main (String[] args) {
    // インスタンスを生成
    Dog black = new Dog();
    // フィールドを設定
    black.name = "Kuro";
    black.age = 2;

    // インスタンスを生成
    Dog white = new Dog();
    // フィールドを設定
    white.name = "Shiro";
    white.age = 3;

    System.out.println(black.name+"("+black.age+")");
    System.out.println(white.name+"("+white.age+")");
  }

}