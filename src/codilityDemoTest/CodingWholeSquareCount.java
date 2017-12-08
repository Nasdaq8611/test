package codilityDemoTest;

public class CodingWholeSquareCount {

	public static void main(String[] args) {
		int A = 4;
		int B = 17;
		int count = 0;
		for (int i = A; i < B; i++) {
			
			double sqrt = Math.sqrt(i);
			int x = (int) sqrt;
			if(Math.pow(sqrt,2) == Math.pow(x,2)){
				count++;
			};
		}
		System.out.print(count);
	}
}
