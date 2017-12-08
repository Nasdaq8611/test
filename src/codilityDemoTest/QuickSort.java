package codilityDemoTest;

public class QuickSort {

	public static void main(String[] args) {

		int[] A = { -2, 6, 5, 4, 3, 2, 1 };

		int low = 0;
		int hight = A.length - 1;
		quickSort(A, low, hight);
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + ",");
			
		}
		

	}

	private static void quickSort(int[] a, int low, int hight) {
		int pivot = hight;
		
		if(low<hight){
			pivot = partition(a, low, hight);
			
			quickSort(a, low, pivot-1);
			quickSort(a, pivot+1, hight);
			
		}
		
	}

	private static int partition(int[] a, int low, int hight) {
		int pivot = a[(hight)];
		int i = low-1;
		for (int j = low; j < hight; j++) {
			
			if(a[j]<pivot){
				i++;	
				swap(a, i, j);
			}
		}
		i++;
		swap(a, i,hight);
		return i;
	}

	private static void swap(int[] a, int i, int j) {
		int buff = a[i];
		a[i]=a[j];
		a[j]=buff;
	}

}
