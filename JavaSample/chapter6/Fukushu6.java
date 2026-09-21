public class Fukushu6 {
  public static void main (String[] args) {
    for(;;){
    int a = (int)(Math.random()*6+1), b = (int)(Math.random()*6+1);
    System.out.print(a+" ");
    System.out.println(b);
    if(a == b){
      break;
    }
    }
  }
}