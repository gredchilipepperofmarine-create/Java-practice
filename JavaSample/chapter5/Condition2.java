public class Condition2 {
	public static void main(String[] args) {
		int x=11, y=22;
		System.out.println(!(9<=x && x<=17));
		System.out.println(!(9<=y && y<=17));
		System.out.println(x<9 || 17<x);
		System.out.println(y<9 || 17<y);
	}
}
