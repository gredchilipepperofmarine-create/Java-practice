public class Clone {
  public static void main (String[] args){
    String[] color1 = {"red", "green", "blue"};
    for (String c: color1){
      System.out.print("color1:"+c+" ");
    }
    System.out.println(" ");
    String[] color2 = color1;
    for (String c2: color2){
      System.out.print("color2:"+c2+" ");
    }

    color1[1] = "yellow";

    for (String c: color1){
      System.out.print("color1:"+c+" ");
    }
    System.out.println(" ");
    color2 = color1;
    for (String c2: color2){
      System.out.print("color2:"+c2+" ");
    }
  }
}