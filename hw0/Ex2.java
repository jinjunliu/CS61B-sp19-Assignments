public class Ex2 {
   /**
    * Returns the maximum value from m using a for loop.
    * @param m 
    * @return maximum value in array m.
    */
   public static int forMax(int[] m) {
       int maxNumber = m[0];
       int i = 1;
       while (i<=m.length-1) {
			if (m[i] > maxNumber) {
				maxNumber = m[i];
			}
			i = i+1;
      }
       return maxNumber;
   }
   public static void main(String[] args) {
      int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
      System.out.println(forMax(numbers));
   }
}
