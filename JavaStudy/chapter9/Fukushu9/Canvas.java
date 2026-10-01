public class Canvas {
  public static void main (String[] args) {

    Figure[] figure = {
      new Rectangle(100, 200, 11, 22),
      new Circle(300, 400, 34),
      new FlowerCircle(500, 600, 56),
      new Label(700, 800, "Hello")
    };

    for(Figure f: figure) {
      f.draw();
    }


  }
}