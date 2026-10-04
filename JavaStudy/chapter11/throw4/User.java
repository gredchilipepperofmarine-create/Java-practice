public class User {
  // フィールドを宣言
  private String name, password;

  // コンストラクタを宣言
  public User(String name, String password) {

    if(name.isEmpty()) {
      // throwで「自分で例外クラスを指定」という意味
      // new　Runtime～で、インスタンスを生成してメッセージを表示
      throw new Exception("the name is empty");
    }
    if(password.isEmpty()) {
      throw new Exception("the password is empty");
    }
    
    this.name = name;
    this.password = password;
  }

  // メソッドを宣言
  public void print() {
    System.out.printf("%s:名前 %s:パスワード", name, password);
  }

  
  
}
