class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            // To know left is sorted or not
            if(nums[left]<=nums[mid]){
                // target is in left half
                if(nums[left]<=target&&target<nums[mid]){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }else{
                // To know right is sorted or not
                // If target is in right half
                if(nums[mid]<target&&target<=nums[right]){
                    left=mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        return -1;
    }
}