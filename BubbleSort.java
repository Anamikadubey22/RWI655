package june6;

public class BubbleSort {

	public void bubbleSort(int[] arr) {
	    int n = arr.length;
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - i - 1; j++) {
	            if (arr[j] > arr[j + 1]) {
	                // Swap arr[j] and arr[j+1]
	                int temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;
	            }
	        }
	    }
	}

	 public static void main(String[] args) {
	        int[] arr = {64, 34, 25, 12, 22, 11, 90};
	        BubbleSort bubbleSort = new BubbleSort();
	        bubbleSort.bubbleSort(arr);

	        // Print the sorted array
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
}