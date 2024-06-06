package june6;

public class RemoveDuplicates {

	public int removeDuplicates(int[] nums) {
	    if (nums.length == 0) return 0;
	    
	    int j = 0;
	    for (int i = 1; i < nums.length; i++) {
	        if (nums[i] != nums[j]) {
	            j++;
	            nums[j] = nums[i];
	        }
	    }
	    
	    return j + 1;
	}

	 public static void main(String[] args) {
	        int[] nums = {1, 1, 2, 3, 3, 4, 4, 5};
	        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
	        int newLength = removeDuplicates.removeDuplicates(nums);
	        
	        // Print the unique elements
	        for (int i = 0; i < newLength; i++) {
	            System.out.print(nums[i] + " ");
	        }
	    }
}
