public class Fukushu7 {
  public static void main (String[] args) {
    int[] dice = new int[30];
    for(int i = 0; i<dice.length; i++){
      dice[i] = (int)(Math.random()*6+1);
    }
    for(int j = 1; j < 7; j++){
      for (int d:dice){
        if(j == d){
          System.out.print(d+" ");
        }
      }
    }
    System.out.println();
  }
  
}
