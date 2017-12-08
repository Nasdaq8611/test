package codilityDemoTest;

import java.util.HashSet;
import java.util.Set;

public class CodilityDemoTest {

	public static void main(String[] args) {

		
		
		CodilityDemoTest codilityDemoTest = new CodilityDemoTest();
		//int[] test = codilityDemoTest.getMatrix();
		int[] test = {1,2,3,3,4,4,5,8,8,8,8,8};
		System.out.println(codilityDemoTest.solution(test));
	
	}
	
	public int[] getMatrix(){
		int[] test = new int[1000001];
		for (int i = 1; i <= 1000000; i++) {
			test[i] = i;
		}
		return test;
	}
	

	public int solution(int[] A) {
		int num = 1;
		Set<Integer> hset = new HashSet<Integer>();

		for (int i = 0; i < A.length; i++) {
			hset.add(A[i]);
		}

		while (hset.contains(num)) {
			num++;
		}
		
		return num;
	}

}
