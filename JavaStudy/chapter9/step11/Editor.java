public class Editor {
  public static void main (String[] args) {

    // Label l = new Label(700, 800, "Hello");
    // l.print();

    // Code c = new Code("public void main(String[] args)");
    // c.print();

    Printable[] printable = {
      new Label(700, 800, "Hello"),
      new Code("public void main(String[] args)")
    };

    for(Printable p: printable) {
      p.print();
    }

  }
  
}
