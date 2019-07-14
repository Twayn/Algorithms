package algorithms.sort;

public class MergeSort extends AbstractSort {
	@Override
	public void sort(int[] arr) {
		mergeSort(arr, 0, arr.length);
	}

	private void mergeSort(int[] array, int leftIncl, int rightExcl) {
		if (rightExcl <= leftIncl + 1) return;

		int mid = (leftIncl + rightExcl) >>> 1;

		mergeSort(array, leftIncl, mid);
		mergeSort(array, mid, rightExcl);

		merge(array, leftIncl, mid, rightExcl);
	}

	private void merge(int[] array, int left, int middle, int right) {
		int i = left;
		int j = middle;
		int k = 0;

		int[] temp = new int[right - left];

		while (i < middle && j < right) {
			if (array[i] <= array[j]) {
				temp[k] = array[i];
				i++;
			} else {
				temp[k] = array[j];
				j++;
			}
			k++;
		}

		for (;i < middle; i++, k++) {
			temp[k] = array[i];
		}

		for (;j < right; j++, k++) {
			temp[k] = array[j];
		}

		System.arraycopy(temp, 0, array, left, temp.length);
	}
}
