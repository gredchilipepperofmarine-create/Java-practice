public class Rectangle extends Figure {

  // フィールドを宣言
  private int width, height;

  // コンストラクタを宣言
  public Rectangle(int x, int y, int width, int height) {
    super(x, y);
    this.width = width;
    this.height = height;
  }

  // drawメソッドを宣言
  public void draw() {
    header("Rectangle");
    System.out.printf(" size:%d x %d\n", width, height);
  }
}
