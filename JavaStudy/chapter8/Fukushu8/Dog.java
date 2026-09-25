public class Dog {

  // フィールドの宣言
  String name;
  int age;

  // コンストラクタの宣言
  Dog (String name, int age){
    this.name = name;
    this.age = age;
  }

  // メソッド
  String profile () {
    return this.name + "(" + this.age + ")";
  }

  // eatメソッド
  void eat (String food) {
    System.out.println(profile() + " eats " + food);
  }

  void eat () {
    System.out.println(profile() + "drinks water.");
  }
  
}
