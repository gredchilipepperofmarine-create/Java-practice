public class Dog {

  // フィールドの宣言
  String name;
  int age;

  // コンストラクタの宣言
  Dog(String name, int age) {
    // 右側のname=引数のname。左側のname=フィールドのname
    // 引数そのものは、保存しないと使えない。
    // 引数で入ってきたnameをフィールドに保存して、初めてインスタンス化の際に使える
    this.name = name;
    this.age = age;
  }
  
}
