class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        while(low<high){
            final int mid = low+(high-low)/2;
            // To find out left part is sorted
            if(nums[mid]<nums[high]){
                high = mid;
                // To find out right part is sorted
            }else{
                low = mid+1;
            }
        }
            return nums[low];

    }
}