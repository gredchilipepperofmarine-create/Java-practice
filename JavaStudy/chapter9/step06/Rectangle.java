// Rectangleクラス(Figureクラスのサブクラス)
public class Rectangle extends Figure {

  // フィールドを宣言(フィールドは継承できないから自分で宣言)
  private int width, height;

  // コンストラクタの宣言(superを使ってスーパークラスのコンストラクタへ渡す。その他は自分で宣言)
  public Rectangle(int x, int y, int width, int height){
    super(x, y);
    this.width = width;
    this.height = height;
  }

  // drawメソッド
  @Override public void drw() {
    header("rectangle");
    System.out.printf(
      "size:%dx%d\n", this.width, this.height);
  }
  
}
