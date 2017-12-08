package realCodilityTest;

import java.util.ArrayList;
import java.util.List;

public class ShortestPossibleSequence {
	public static void main(String[] args) {
		int N = 1;
		List<Integer> array = new ArrayList<Integer>();
		array.add(N);
		getArray(N, array);
		int i = revertArray(array).size();
		if(array.get(0)==0){
		}
		System.out.println(i);

	}

	private static List<Integer> revertArray(List<Integer> array) {
		List<Integer> newArray = new ArrayList<Integer>(array.size());

		for (int i = array.size() - 1; i >= 0; i--) {
			int arrayElement = array.get(i);
			newArray.add(arrayElement);
		}

		return newArray;

	}

	private static List getArray(int N, List<Integer> array) {

		if ((N % 2) != 0) {
			N -= 1;
			if (N > 0) {
				array.add(N);
				getArray(N, array);
			}
		} else {
			if (N > 1) {
				N/=2;
				if (N > 0) {
					array.add(N);
					getArray(N, array);
				}
			}
		}
		return null;
	}
}
