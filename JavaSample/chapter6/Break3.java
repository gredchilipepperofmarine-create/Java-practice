public class Break3 {
  public static void main (String[] args) {
    for(;;){
      int x = (int)(Math.random()*6+1), y = (int)(Math.random()*6+1);
      System.out.println(x+" "+y);
      if(x == y){
        break;
      }
    }

  }
}