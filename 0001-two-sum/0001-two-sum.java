class Solution {
    public int[] twoSum(int[] nums, int target) {
    int n = nums.length;
    int[] arr = new int[2]; // You only need an array of size 2 to store the result.

    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) { // Start j from i + 1 to avoid using the same element twice.
            if (nums[i] + nums[j] == target) {
                arr[0] = i; // Store the indices of the two numbers.
                arr[1] = j;
                return arr;
            }
        }
    }

    return arr; // If no solution is found, return the initialized array.
}

}