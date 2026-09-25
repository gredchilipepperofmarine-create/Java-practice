public class Dog {
  // フィールドを設定
  String name;
  int age;

  // コンストラクタを設定
  Dog (String name, int age){
    this.name = name;
    this.age = age;
  }

  String profile() {
    return this.name+"("+this.age+"eats"+")";
  }

  void eat(String food) {
    System.out.println(profile() + "eats" + food + ".");
  }
  
}
