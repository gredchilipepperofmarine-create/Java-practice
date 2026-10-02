public class Code {

  // フィールドを宣言
  private String code;

  // インスタンス生成のたびに初期化される。その際の動作をしていするためコンストラクタを宣言
  public Code(String code) {
    this.code = code;
  }

  // printメソッドを宣言
  public  void print() {
    System.out.println(code);
  }
  
}
