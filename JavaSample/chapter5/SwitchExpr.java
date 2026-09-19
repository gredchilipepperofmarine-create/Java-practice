public class SwitchExpr {
  public static void main (String[] args) {
    int drink = 1;
    System.out.println(
      switch (drink) {
        case 1 -> "coffee";
        case 2 -> "tea";
        default -> "water";
      }
    );
  }
  
}