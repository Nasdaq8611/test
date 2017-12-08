package collabedit;

public class FuzzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String original = "Some string which should be transformed into a exercise function and one two tree four five";
				
				System.out.println(new FuzzBuzz().transformFuzzBuzz(original));
	}

	private String transformFuzzBuzz(String original) {

		String[] originalStringArray = original.split(" ");
		StringBuilder str = new StringBuilder();
		
		for (int i = 1; i <= originalStringArray.length ; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				originalStringArray[i-1] = "FuzzBuzz";
			} else {
				if (i % 3 == 0) {
					originalStringArray[i-1] = "Fuzz";
				} else {
					if (i % 5 == 0) {
						originalStringArray[i-1] = "Fuzz";
					}
				}

			}
			str.append(" ");
			str.append(originalStringArray[i-1]);
		}
		
		
		return str.toString();
	}

}
