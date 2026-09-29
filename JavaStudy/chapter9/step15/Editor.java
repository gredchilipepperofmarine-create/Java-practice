public class Editor {
  public static void main (String[] args) {
    Object[] object = {
      new Label(700, 800, "Hello"),
      new Code("public void main (String[] args")
    };

    for(Object o: object) {

      // Figureクラスのインスタンスに対しては、
      // drawメソッドを呼び出す
      switch(o) {
        case Figure f -> f.draw();
        default -> System.out.println(o);
      }
    }
  }
}
