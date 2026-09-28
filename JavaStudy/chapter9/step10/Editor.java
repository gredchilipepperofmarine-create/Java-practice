public class Editor {
  public static void main (String[] args) {

    Label l = new Label(700, 800, "Hello");
    l.print();

    Code c = new Code("public void main(String[] args)");
    c.print();

  }
  
}
