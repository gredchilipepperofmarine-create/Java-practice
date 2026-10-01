public class Circle extends Figure{
  private int radius;

  public Circle(int x, int y, int radius) {
    super(x, y);
    this.radius = radius;
  }

  @Override public void draw() {
    header("Circle");
    System.out.println(" radius: " + radius);
  }
    
}
