public class Kennel {
  public static void main (String[] args) {
    // Dogクラスで設定したコンストラクタをここで使用する
    // Dog(:Dogクラスの)black(:自分でここで指定した変数名) = new(:インスタンスを生成) Dog(コンストラクタに入る引数)
    Dog black = new Dog("Kuro", 2);
      System.out.println(black.name+"("+black.age+")");

    Dog white = new Dog("Shiro", 3);
      System.out.println(white.name+"("+white.age+")");
  }
  
}
