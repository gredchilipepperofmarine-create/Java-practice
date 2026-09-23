public class Fukushu7 {
  public static void main (String[] args) {
    String[][] menu = {
      {"bread","crape"},
      {"cocoa","coffee","milk"},
      {"apple", "orange"}
    };
    for(String[] category:menu){
      for(String item: category){
        System.out.print(item+" ");
      }
      System.out.println();
    }
  }
  
}
