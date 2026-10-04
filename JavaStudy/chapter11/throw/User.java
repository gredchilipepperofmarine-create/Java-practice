public class User {
  // フィールドを宣言
  private String name, password;

  // コンストラクタを宣言
  public User(String name, String password) {
    this.name = name;
    this.password = password;
  }

  // メソッドを宣言
  public void print() {
    System.out.printf("%s:名前 %s:パスワード", name, password);
  }

  
  
}
