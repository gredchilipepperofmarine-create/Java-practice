public class Try6 {
  public static void main (String[] args) {
    // コマンドライン引数：mainのString配列であるargsに対して、ターミナルでコンパイルして実行する際に
    // java ファイル名　引数　と入力すると、コマンドライン引数として与えられる

    // 整数を変数aとbで宣言。Integer.parseInt()を使って、コマンドライン引数を変換する

    try {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      System.out.println(a/b);
    } catch (Exception e) {
      System.out.println("usage: java Try <integer> <integer>");
      e.printStackTrace();
    }

  }
}