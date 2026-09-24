public class Kennel {
  public static void main (String[] args) {
    // インスタンスを生成
    Dog black = new Dog();
    // フィールドを設定
    black.age = 2;

    System.out.println(black.name+"("+black.age+")");
    
    // インスタンスを生成
    Dog white = new Dog();
    // フィールドを設定
    white.name = "Shiro";

    System.out.println(white.name+"("+white.age+")");
  }

}