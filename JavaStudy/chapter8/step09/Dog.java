public class Dog {
  // フィールドを設定
  private String name;
  private int age;

  // クラス変数(クラスに属するフィールド)
  private static int count;

  // コンストラクタを設定
  public Dog (String name, int age) {
    this.name = name;
    this.age = age;
    
    count++;
  }


  // インスタンスメソッドを設定
  public String profile () {
    return this.name + "(" + this.age + ")";
  }

  // クラスメソッド
  public static void report() {
    // インスタンスの個数を出力
    System.out.println(count + " instances were created.");
  }
  
}
