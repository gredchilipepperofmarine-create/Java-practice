public class Circle {
  // フィールドを宣言
  private int x, y, radius;

  // コンストラクタを宣言
  public Circle(int x, int y, int radius) {
    this.x = x;
    this.y = y;
    this.radius= radius;
  }

  // メソッドを宣言
  public void draw() {
    System.out.printf("circle(%d,%d) radius:%d\n", this.x, this.y, this.radius);
  }
  
}
