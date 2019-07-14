package algorithms.sort;

abstract class AbstractSort implements Sort{
	static void swap(int[] arr, int l, int r){
		arr[r] = arr[r]^arr[l]^(arr[l] = arr[r]);
	}
}
