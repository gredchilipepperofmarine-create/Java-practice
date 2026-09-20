public class DoWhile {
  public static void main (String[] args) {
    do {
      System.out.println("Win!");
    } while (Math.random()*1.0<0.5);
    System.out.println("Lose!");
  }
}