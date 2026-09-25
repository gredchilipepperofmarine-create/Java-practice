public class Kennel {
  public static void main (String[] args) {

    Dog black = new Dog("Kuro", 2);
    black.setAge(black.getAge()+1);
    System.out.println(black.profile());

    Dog white = new Dog("Shiro", 3);
    white.setName(white.getName().toUpperCase());
    System.out.println(white.profile());
  }
  
}
