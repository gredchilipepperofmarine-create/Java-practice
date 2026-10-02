public class Editor {
  public static void main(String[] args) {

    // Printable型の配列printableを宣言
    Printable[] printable = {
      new Label(700, 800, "Hello"),
      new Code("public void main(String[] args)")
    };

    // 配列内の各要素に対してprintメソッドを呼び出す
    for(Printable p: printable) {
      p.print();
    }
   

  }
  
}
