class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int can = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(count == 0){
                can=nums[i];
            }
            if(nums[i]==can){
                count++;
            }else{
                count--;
            } 
        }
        return can;   
    }
}