package collabedit;

public class BinarySearch {

	public void testExistingNumber() {
	}

	public void testNotExistingNumber() {
	}

	public void testNullableArray() {
	}

	public static void main(String[] args) {
		int number = 222;
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println(new BinarySearch().binarySearchFind(number, array, 0, array.length));
	}

	public boolean binarySearchFind(int number, int[] array, int l, int r) {

		int middle = l + (r - l) / 2;
String str = "ss";

Integer.toBinaryString(1);
		if (middle < array.length && middle!=0) {
			if (array[middle] > number) {
				return binarySearchFind(number, array, l, middle);
			} else if (array[middle] < number) {
				return binarySearchFind(number, array, middle + 1, r);
			} else if (array[middle] == number)
				return true;
		}
		return false;
	}

}
