public class FlowerCircle extends Circle{
  // コンストラクタを宣言
  public FlowerCircle(int x, int y, int radius){
    super(x, y, radius);
  }

  @Override public void draw() {
    System.out.println("flower");
    super.draw();
  }

  
}
