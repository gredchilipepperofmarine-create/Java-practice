public class Throw {
  public static void main (String[] args) {

    try {
      User user = new User("", "abc123");
      user.print();
    } catch (Exception e) {
      System.out.println("error: " + e.getMessage());
    }
  }
  
}
