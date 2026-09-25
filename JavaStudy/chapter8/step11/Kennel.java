public class Kennel {
  public static void main (String[] args) {

    // インスタンスを生成と同時に初期化して値を設定
    Dog black = new Dog(2);
    System.out.println(black.profile());

    Dog white = new Dog();
    System.out.println(white.profile());
  }
  
}
