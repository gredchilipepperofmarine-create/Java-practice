public class Circle {
  private int x, y, radius;

  public Circle(int x, int y, int radius) {
    this.x = x;
    this.y = y;
    this.radius = radius;
  }

  public void draw() {
    System.out.printf("cirsle (%d, %d) radius: %d", x, y, radius);
  }
    
}
