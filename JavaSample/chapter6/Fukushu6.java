public class Fukushu6 {
  public static void main (String[] args) {
    for(;;){
    int a = (int)(Math.random()*6+1), b = (int)(Math.random()*6+1);
    if(a > b){
      continue;
    }
  System.out.print(a+" "+b);
  if(a==b){
    break;
  }


    }
  }
}