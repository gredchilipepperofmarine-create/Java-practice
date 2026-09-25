public class Dog {

  // フィールドの宣言
  private String name;
  private int age;

  // コンストラクタの宣言
  public Dog (String name, int age){
    this.name = name;
    this.age = age;
  }

  // nameのゲッター
  public String getName() {
    return this.name;
  }
  // nameのセッター
  public void setName(String name) {
    this.name = name;
  }
  
  // ageのゲッター
  public int getAge() {
    return this.age;
  }
  // ageのセッター
  public void setAge(int age) {
    this.age = age;
  }

  // メソッド
  public String profile () {
    return this.name + "(" + this.age + ")";
  }

  // eatメソッド
  public void eat (String food) {
    System.out.println(profile() + " eats " + food);
  }

  public void eat () {
    System.out.println(profile() + "drinks water.");
  }
  
}
