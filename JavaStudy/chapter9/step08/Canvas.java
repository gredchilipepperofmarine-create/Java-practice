public class Canvas {
  public static void main (String[] args) {

    // 矩形のインスタンスを生成し、情報を出力
    // Rectangle r = new Rectangle(100, 200, 11, 22);
    // r.draw();

    // Circleインスタンスを生成
    // Circle c = new Circle(300,400,34);
    // c.draw();

    Figure[] figure = {
      new Rectangle(100, 200, 11, 22),
      new Circle(300, 400, 34),
      new FlowerCircle(500, 600, 56)
    };

    for(Figure f : figure){
      f.draw();
    }
  }
  
}
