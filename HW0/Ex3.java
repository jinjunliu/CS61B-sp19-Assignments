public class Ex3 {
   public static int max(int[] m) {
       int maxNumber = m[0];
       for(int i=1; i<=m.length-1; i+=1){
			if(m[i]>maxNumber){
				maxNumber = m[i];
			}
      }
       return maxNumber;
   }
   public static void main(String[] args) {
      int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
      System.out.println(max(numbers));
   }
}