public class Editor {
  public static void main (String[] args) {
    Object[] object = {
      new Label(700, 800, "Hello"),
      new Code("public void main (String[] args")
    };

    for(Object o: object) {
      System.out.println(o);
    }



  }
  
}
