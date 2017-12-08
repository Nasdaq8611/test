package codilityDemoTest;

import java.util.ArrayList;

public class Extreme {

	public static void main(String[] args) {
		int[] A = {9,4,-3,-10,-10,1,1,-10};
		int buffM = 0 ;
		for (int i = 0; i < A.length; i++) {
			int j = A[i];
			buffM +=j;
		}
		int M = 0;
		M = M/A.length;
		
		int maxDeviation;
		ArrayList<Integer> deviationNumbers = new ArrayList<Integer>();
		maxDeviation = A[0] -M;
		for (int i = 1; i < A.length; i++) {
			int j = A[i];
			int currentDeviation = j - M;
			
			if(Math.abs(maxDeviation)==Math.abs(currentDeviation)){
				deviationNumbers.add(i);
			}else{
				if(Math.abs(maxDeviation)<Math.abs(currentDeviation)){
					deviationNumbers.clear();
					deviationNumbers.add(i);
					maxDeviation = currentDeviation;
				}
			}

			
		}
		
		for (int i = 0; i < deviationNumbers.size(); i++) {
			int j = deviationNumbers.get(i);
			System.out.println(j);	
		}
		
	}
	
}
