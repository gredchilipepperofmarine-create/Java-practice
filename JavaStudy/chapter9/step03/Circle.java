public class Circle extends Figure {
  // フィールドを宣言
  private int radius;

  // コンストラクタを宣言
  public Circle(int x, int y, int radius) {
    super(x, y);
    this.radius= radius;
  }

  // メソッドを宣言
  public void draw() {
    System.out.printf("circle(%d,%d) radius:%d\n", this.x, this.y, this.radius);
  }
  
}
