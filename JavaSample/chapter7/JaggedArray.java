public class JaggedArray {
	public static void main(String[] args) {
		String[][] menu={
			{"bread", "crepe", "donut"}, 
			{"cocoa", "coffee", "milk", "tea"},
			{"apple", "orange"}
		};
		for (String[] category: menu) {
			for (String item: category) {
				System.out.printf(item+" ");
			}
			System.out.println();
		}
	}
}
