public class Break4 {
  public static void main (String[] args) {
    int x, y;
    do {
      x = (int)(Math.random()*6+1);
      y = (int)(Math.random()*6+1);
      System.out.println(x+" "+y);
    } while (x != y);
      System.out.println(x+" "+y);

  }
}