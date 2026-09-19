public class Chapter5Fukushu {
  public static void main (String[] args) {
    int menu = 2;
    System.out.println(
      switch (menu) {
        case 2-> "icecream";
        case 1-> "salad";
        default -> "steak";
      }
    );
  }
  
}