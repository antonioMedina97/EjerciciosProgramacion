package toolbox;

public class UtilsArray {

	public static int[] createRandomArray(int length, int numMax, int numMin) {
			
			int array[] = new int[length];
			
			for (int i = 0; i < array.length; i++) {
				array[i]=Utils.generateRandomNum(numMax, numMin);
				
				
			}
			return array;
		}
	
		/**
		 * 
		 * @param length
		 * @param numMax
		 * @param numMin
		 * @return
		 */
	public static int[] createRandomArrayPrint(int length, int numMax, int numMin) {
		
		int array[] = new int[length];
		
		for (int i = 0; i < array.length; i++) {
			array[i]=Utils.generateRandomNum(numMax, numMin);
			
			System.out.print(array[i] + " ");
			
		}
		return array;
	}
	
	public static int[] createNumberedArray(int length) {
		int array[] = new int[length];
		for (int i = 0; i < array.length; i++) {
			array[i]= i + 1;
		}
		return array;
	}
	

}
