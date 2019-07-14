package algorithms.sort;

import java.util.Arrays;

import org.junit.Assert;

public class Test {
	private static int[] forSort = {1, 9, 3, 5, 7, 14, -2};
	private static final int[] array = {1, 9, 3, 5, 7, 14, -2};
	private static final int[] sorted = {-2, 1, 3, 5, 7, 9, 14};

	@org.junit.Test
	public void testSort(){
		boolean res = checkSort(new BubbleSort());
		res = res && checkSort(new InsertionSort());
		res = res && checkSort(new SelectionSort());
		res = res && checkSort(new MergeSort());
		res = res && checkSort(new QuickSort());

		Assert.assertTrue(res);
	}

	private static boolean checkSort(Sort sort){
		sort.sort(forSort);
		boolean res = Arrays.equals(forSort, sorted);
		forSort = array;
		return res;
	}
}
