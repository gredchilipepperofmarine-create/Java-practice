public class Clone {
	public static void main(String[] args) {
		String[] color1={"red", "green", "blue"};
		System.out.print("color1: ");
		for (String c: color1) {
			System.out.print(c+" ");
		}
		System.out.println();
		
		String[] color2=color1;
		System.out.print("color2: ");
		for (String c: color2) {
			System.out.print(c+" ");
		}
		System.out.println();
	}
}
