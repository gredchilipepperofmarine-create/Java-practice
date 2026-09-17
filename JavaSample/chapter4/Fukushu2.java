public class Fukushu2 {
  public static void main (String[] args) {
    var total = 450+670+890;
    System.out.println(total);
    System.out.println(total/2);
    System.out.println(total/3);

    double radius = 1.23;
    System.out.println(radius*2*Math.PI);
    System.out.println(radius*radius*Math.PI);

    var a=123;
    var b=4.56;
    var c='A';
    var d="Hello";
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);

    int doller = 23, rate = 110;
    System.out.println("yen:"+doller*rate);
    rate = 150;
    System.out.println("yen:"+doller*rate);

    int deposit = 100_000;
    double rate2 = 1.1;
    System.out.println(deposit);
    deposit *= rate2;
    System.out.println(deposit);

    final double AVOGADRO = 6.02*10e23, PLANCK = 6.63*10e-34;
    System.out.println(AVOGADRO);
    System.out.println(PLANCK);
    byte aa = 100;
    short bb = 1000;
    int cc = 100_000_000;
    long dd = 1_000_000_000_000L;
    System.out.println(aa);
    System.out.println(bb);
    System.out.println(cc);
    System.out.println(dd);

  }
  
}
