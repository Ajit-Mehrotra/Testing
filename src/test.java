
public class test {
	public static void main(String args[]) {
		int lol = 0;
		
		int [][] a = new int[8][8];
		for(int b = 0; b < a.length; b++) {
			for(int c = 0; c < a.length; c++) {
				lol++;
				a[b][c] = lol;
			}
			
		}
 
/*		for(int d = 0; d < a.length; d++) {
			
			
			for(int f = 0; f < a.length; f++) {

				System.out.println(a[d][f]);
				System.out.println("Row: " + d);
				System.out.println("Col: " + f);
			}
	}		*/	
			
			
		for(int[] array: a) {
			int counter = 0;
			System.out.println(array[counter]);
			counter++;
			
			/*for(int b: array) {
				System.out.println("Array Position: " + b);
			}*/
		}

	}
}
