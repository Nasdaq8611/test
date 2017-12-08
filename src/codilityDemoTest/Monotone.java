package codilityDemoTest;

public class Monotone {

	public static void main(String[] args) {
		int[] A = {2,2,2,2,1,2,-1,2,1,3};
		
		int pivot = 0;
		int subArrayLenght = 0;
		
		for (int i = 0; i < A.length; i++) {
			int j = A[i];
			
			if(j>=pivot){
				pivot = j;
				subArrayLenght++;
			}
			else{
				
				if(j<pivot){
					pivot = j;
					System.out.println(i);
					subArrayLenght=0;
				}
			}
			
			
		}
	}
	
}
