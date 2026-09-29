public class Figure {
  protected int x, y;

  public Figure(int x, int  y){
    this.x = x;
    this.y = y;
  }

  protected void header(String name) {
    System.out.printf("%s (%d, %d)", name, x, y);
  }
  
}
