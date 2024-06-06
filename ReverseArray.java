package june6;


public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ReverseArray reverseArray = new ReverseArray();
        reverseArray.ReverseArray(arr);
        
        // Print the reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public void ReverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
}