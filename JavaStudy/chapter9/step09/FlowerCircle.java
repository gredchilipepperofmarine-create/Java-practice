public class FlowerCircle extends Circle{

  // コンストラクタ
  public FlowerCircle(int x, int y, int radius){
    super(x, y, radius);
  }

  // メソッド
  @Override public void draw() {
    System.out.print("flower ");

    // スーパークラスのdrawメソッドを呼び出し
    super.draw();
  }

  
}
