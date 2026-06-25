class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    
    for(int i = 0;i<n;i++){
        nums1[i+m] = nums2[i];
    }
    for(int j = 0;j<m+n;j++){
        for(int k = 0;k<m+n;k++){
            if(nums1[j]<nums1[k]){
                int temp = nums1[j];
                nums1[j] = nums1[k];
                nums1[k] = temp;
            }
        }
    }

    }
}