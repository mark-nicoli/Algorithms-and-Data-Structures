import java.util.*;
public class quicksort {
	public static void main(String[] args) {
		int[] x = { 5,1,5,7,3,5,2,5,68 };
		System.out.println(Arrays.toString(x));
		int low = 0;
		int high = x.length - 1;
		quickSort(x, low, high);
		System.out.println(Arrays.toString(x));
	}
	public static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0) return;
		if (low >= high) return;
		int middle = (high - low)/2; // pick the pivot
		int pivot = arr[middle];
		int i = low;
		int j = high;
		while (i <= j) {
			while (arr[i] < pivot) i++;
			while (arr[j] > pivot) j--;
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		if (low < j) quickSort(arr, low, j); //sort both sides recursively
		if (high > i) quickSort(arr, i, high);
	}
}

