public class Dog {
  // フィールドの宣言
  String name;
  int age;

  // コンストラクタの宣言
  Dog(String name, int age){
    this.name = name;
    this.age = age;
  }

  // メソッドの宣言
  String profile() {
    return this.name + "(" + this.age + ")";
  }
}
