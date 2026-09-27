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
    header("circle");
    System.out.printf("radius:%d\n", this.radius);
  }
  
}
