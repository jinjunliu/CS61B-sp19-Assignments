public class Ex1a {
	public static void main(final String[] args) {
		int row = 0;
		final int SIZE = 5;
		while (row < SIZE) {
			int col = 0;
			while (col <= row) {
				System.out.print('*');
				col = col + 1;
			}
			System.out.println();
			row = row + 1;
		}
	}
}
