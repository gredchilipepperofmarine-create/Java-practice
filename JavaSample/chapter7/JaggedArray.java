public class JaggedArray {
  public static void main (String[] args) {
    String[][] menu = {
      {"bread", "crape", "donut"},
      {"cocoa", "coffee", "milk", "tea"},
      {"apple", "orange"}
    };
    for(String[] category: menu){
      for(String item: category){
        System.out.print(item+" ");
      }
      System.out.println();
    }
  }
  
}
