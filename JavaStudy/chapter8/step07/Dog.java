public class Dog {
  // フィールドを設定
  private String name;
  private int age;

  // コンストラクタを設定
  public Dog (String name, int age) {
    this.name = name;
    this.age = age;
  }

  // メソッドを設定
  public String profile () {
    return this.name + "(" + this.age + ")";
  }

  public void eat (String food) {
    System.out.println(profile() + " eats " + food);
  }

  public void eat () {
    System.out.println(profile() + " drinks water.");
  }

  
}
