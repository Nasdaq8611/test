package codilityDemoTest;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] A = {6,5,4,3,2,1};
		
		int l = 0;
		int r = A.length-1;
		mergeSort(A, l,r);
		
	}

	private static void mergeSort(int[] a,int l,int r) {
	
		if(r>l){
			int m = (l+r)/2;
						
			mergeSort(a, l ,m);
			mergeSort(a, m+1, r);
			merge(a,l,m,r);
		}
		
	}
	
	private static void merge(int[] arr, int l, int m, int r) {
		// TODO Auto-generated method stub
		 // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
        
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
        
        int i = 0;
        int j = 0; 
        
        int k = l;
        while(i<n1 && j<n2){
        	if(L[i] < R[j]){
        		arr[k] = L[i];
        		i++;
        	}else{
        		arr[k] = R[j];
        		j++;
        	}
        	k++;
        }
        
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
        
	}

	
}
