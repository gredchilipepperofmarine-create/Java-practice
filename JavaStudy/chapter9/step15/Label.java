public class Label extends Figure implements Printable {
  // フィールドを宣言
  private String text;

  // コンストラクタを宣言
  public Label(int x, int y, String text) {
    super(x, y);
    this.text = text;
  }

  // メソッドを宣言
  @Override public void draw() {
    header("label");
    System.out.println("text:" + text);
  } 

  @Override public void print() {
    System.out.println(text);
  }

  @Override public String toString() {
    return "Label:" + text;
  }

  
}
