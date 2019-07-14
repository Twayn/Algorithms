package algorithms.sort;

public class InsertionSort extends AbstractSort {
	@Override
	public void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++){
			for (int j = i; j > 0 && arr[j-1] > arr[j]; j--){
				swap(arr, j, j-1);
			}
		}
	}
}
