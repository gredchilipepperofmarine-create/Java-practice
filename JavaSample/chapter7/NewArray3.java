public class NewArray3 {
	public static void main(String[] args) {
		int[] dice=new int[30];
		for (int i=0; i<dice.length; i++) {
			dice[i]=(int)(Math.random()*6+1);
		}
		for (int d: dice) {
			System.out.print(d);
		}
		System.out.println();
		for (int i=dice.length-1; i>=0; i--) {
			System.out.print(dice[i]);
		}
		System.out.println();
	}
}
