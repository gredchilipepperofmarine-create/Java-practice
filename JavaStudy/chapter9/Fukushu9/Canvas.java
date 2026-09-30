public class Canvas {
  public static void main (String[] args) {

    Figure[] figure = {
      new Rectangle(100, 200, 11, 22),
      new Circle(300, 400, 34)
    };

    for(Figure f: figure) {
      f.draw();
    }


  }
}