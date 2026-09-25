public class Rectangle {

  // フィールドを宣言
  private int x, y, width, height;

  // コンストラクタの宣言
  public Rectangle(int x, int y, int width, int height){
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  // drawメソッド
  public void draw() {
    System.out.println("rectangle (" + this.x, this.y + ") size:" width );
  }
  
}
