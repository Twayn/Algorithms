package algorithms.sort;

public class QuickSort extends AbstractSort {
	@Override
	public void sort(int[] arr) {
		quickSort(arr, 0, arr.length-1);
	}

	private static void quickSort(int[] array, int left, int right) {
		if (left < right) {
			int pivotIndex = partition(array, left, right);
			quickSort(array, left, pivotIndex - 1);
			quickSort(array, pivotIndex + 1, right);
		}
	}

	private static int partition(int[] array, int left, int right) {
		int pivot = array[right];
		int partitionIndex = left;

		for (int i = left; i < right; i++) {
			if (array[i] <= pivot) {
				swap(array, i, partitionIndex);
				partitionIndex++;
			}
		}

		swap(array, partitionIndex, right);

		return partitionIndex;
	}
}
