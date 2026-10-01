public class Label extends Figure {

  // フィールドを宣言
  private String text;

  // コンストラクタを宣言
  public Label(int x, int y, String text) {
    super(x, y);
    this.text = text;
  }

  // メソッド
  @Override public void draw() {
    header("label");
    System.out.println("text:"+text);
  }
  
}
