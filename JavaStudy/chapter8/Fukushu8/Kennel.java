public class Kennel {
  public static void main (String[] args) {

    Dog black = new Dog();
    black.age = 2;
    System.out.println(black.name + "(" + black.age + ")");

    Dog white = new Dog();
    white.name = "Shiro";
    System.out.println(white.name + "(" + white.age + ")");
  }
  
}
