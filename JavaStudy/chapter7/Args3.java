public class Args3 {
  public static void main (String[] args) {

    if(args.length == 0){
      System.out.println("usage: java Args3 <integer>...");
    } else {
      int total = 0;
      for(String a: args){
        total += Integer.parseInt(a);
      }
      System.out.println(total);
    }
  }
}
