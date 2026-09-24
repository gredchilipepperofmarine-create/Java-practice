public class SwitchExpr2 {
	public static void main(String[] args) {
		int month=1;
		System.out.println(
			switch (month) {
				case 2 -> 28;
				case 4, 6, 9, 11 -> 30;
				default -> 31;
			}
		);
	}
}
