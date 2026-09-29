public abstract class Figure {

  // フィールドを宣言
  protected int x, y;

  // コンストラクタを宣言
  public Figure(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // メソッド
  protected void header(String name) {
    System.out.printf("%s (%d, %d) ", name, x, y);
  }
  public abstract void draw();
  
}
