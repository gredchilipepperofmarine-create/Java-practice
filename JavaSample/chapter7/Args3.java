public class Args2 {
  public static void main (String[] args) {
    int total = 0;

    for(String a: args){
      total += Integer.parseInt(a);
    }
    System.out.println(total);
  }
  
}
