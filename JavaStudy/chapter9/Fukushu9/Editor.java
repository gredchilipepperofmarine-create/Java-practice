public class Editor {
  public static void main(String[] args) {

    // Object型の配列objectを宣言
    Object[] object = {
      new Label(700, 800, "Hello"),
      new Code("public void main(String[] args)")
    };
    for(Object o:object) {
      switch(o) {
        case Figure f -> f.draw();
        default -> System.out.println(o);
      }
    }
  

  }
  
}
