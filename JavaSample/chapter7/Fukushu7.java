public class Fukushu7 {
  public static void main (String[] args) {
    int total = 0;
    if(args.length == 0){
      System.out.println("0dayo");
    } else {
    for(String a:args){
      total += Integer.parseInt(a);
    }
    System.out.println(total);
  }
  }
  
}
