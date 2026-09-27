// Rectangleクラス(Figureクラスのサブクラス)
public class Rectangle extends Figure {

  // フィールドを宣言(フィールドは継承できないから自分で宣言)
  private int x, y, width, height;

  // コンストラクタの宣言(superを使ってスーパークラスのコンストラクタへ渡す。その他は自分で宣言)
  public Rectangle(int x, int y, int width, int height){
    super(x, y);
    this.width = width;
    this.height = height;
  }

  // drawメソッド
  public void draw() {
    System.out.printf(
      "rectangle (%d, %d) size:%dx%d\n", this.x, this.y, this.width, this.height);
  }
  
}
