class Solution {
    public int maxProfit(int[] nums) {
        int min = nums[0];
        int maxProfit = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            int profit = nums[i]-min;
           maxProfit =  profit>maxProfit?profit:maxProfit;

        }
        return maxProfit;
    }
}