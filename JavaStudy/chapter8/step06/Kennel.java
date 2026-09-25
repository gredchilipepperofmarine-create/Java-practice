public class Kennel {
  public static void main (String[] args) {
    // インスタンスを生成し、変数blackで初期化と同時に引数を与える
    Dog black = new Dog("Kuro", 2);
    black.eat("fish");
    black.eat();
  }
  
}
