public class Code implements Printable {
  
  // フィールドを宣言
  private String code;

  // コンストラクタを宣言
  public Code(String code){
    this.code = code;
  }

  @Override public void print() {
    System.out.println(code);
  }
  
}
