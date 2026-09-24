public class NewArray4 {
  public static void main (String[] args){
    int[] dice = new int[30];
    for (int i=0; i<dice.length; i++){
      dice[i] = (int)(Math.random()*6+1);
    }
    for(int i=1; i<=6; i++){
      for(int d: dice){
        if(i==d){
          System.out.print(d+" ");
        }
      }
      
    }
  }
  
}