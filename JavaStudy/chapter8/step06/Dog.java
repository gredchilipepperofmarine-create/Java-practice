public class Dog {
  // フィールドを宣言
  String name;
  int age;

  // コンストラクタを宣言
  Dog (String name, int age){
    this.name = name;
    this.age = age;
  }
  // メソッドを宣言
  String profile(){
    return this.name + "(" + this.age + ")";
  }
  // 同じクラス内で別のメソッドを呼び出して使用
  void eat (String food){
    System.out.println(profile() + " eats " + food + ".");
  }

  void eat () {
    System.out.println(profile() + "drinks water.");
  }
  
}
