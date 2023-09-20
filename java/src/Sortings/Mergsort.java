package Sortings;

public class Mergsort extends SortingAlgos{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[]= {12,11,13,5,6,7};
         Mergsort ob=new Mergsort();
         ob.sort(arr,0,arr.length-1);
        ob.display(arr);
	}

	private void sort(int[] arr, int l, int r) {
		if(l<r) {
			int mid=l+ (r-l)/2;
			//System.out.println(mid);
			sort(arr,l,mid);
			sort(arr,mid+1,r);
			
			Mergsorting(arr,l,mid,r);
			
		}
	}

	private void Mergsorting(int[] arr, int l, int mid, int r) {
		int n1 = mid - l + 1;
        int n2 = r - mid;
 
         int L[] = new int[n1];
        int R[] = new int[n2];
 
         for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
         while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
	}

}
