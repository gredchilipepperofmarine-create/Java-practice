public class Break3 {
	public static void main(String[] args) {
		for (;;) {
			int a=(int)(Math.random()*6+1);
			int b=(int)(Math.random()*6+1);
			System.out.println(a+" "+b);
			if (a==b) {
				break;
			}
		}
	}
}
