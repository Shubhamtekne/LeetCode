class Solution {
    public int search(int[] nums, int target) {
        if(nums.length<2){
            if(nums[0]==target){
                return 0;
            }
        }
     int left = 0 , right = nums.length-1;
     int mid ;

     while(left<=right){
        mid=(left + right)/2;
        if(nums[mid]==target ){
            return mid;
        }else if(target > nums[mid]){
            left = mid + 1;
        }else{
            right = mid -1;
        }
     } 
     return -1;  
    }
}