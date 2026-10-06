public class User {
  // フィールドを宣言
  private String name, password;

  // コンストラクタを宣言
  // throwsは、このメソッド内で処理(tory/chatch)をせず、呼ばれる側に例外を投げる処理
  // 例外が起きるかもだから、起きた場合はそっち側(読んだ方)で何とかしてねと言っている
  // だから、呼び出し元のif(name.isEmpty)の中でthrowを
  public User(String name, String password) throws Exception {

    if(name.isEmpty()) {
      // throwで「自分で例外クラスを指定」という意味。例外が起こるかもしれないよと言っている
      // 引数nameが空文字列なら、この例外を投げる、という処理
      throw new Exception("the name is empty");
    }
    if(password.isEmpty()) {
      throw new Exception("the password is empty");
    }
    
    // フィールドに引数を設定
    this.name = name;
    this.password = password;
  }

  // メソッドを宣言
  public void print() {
    System.out.printf("%s:名前 %s:パスワード", name, password);
  }

  
  
}
