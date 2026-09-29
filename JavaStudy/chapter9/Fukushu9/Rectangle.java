public class Rectangle {

  // フィールドを宣言
  private int x, y, width, height;

  // コンストラクタを宣言
  public Rectangle(int x, int y, int width, int height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  // drawメソッドを宣言
  public void draw() {
    System.out.printf("rectangle (%d, %d) size:%d x %d\n", x, y, width, height);
  }
}
