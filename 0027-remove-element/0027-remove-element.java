class Solution {
    public int removeElement(int[] nums, int val) {
    int newSize = 0; // Initialize a variable to keep track of the new length.
    
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != val) {
            nums[newSize] = nums[i]; // Copy non-matching elements to the front of the array.
            newSize++; // Increment the new length.
        }
    }
    
    return newSize;
    }
}