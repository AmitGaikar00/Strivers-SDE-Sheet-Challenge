class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1_index = m - 1;
        int nums2_index = n - 1;
        int last_index = m+n-1;
        
        while(nums2_index>=0){
            if(nums1_index >= 0 && nums1[nums1_index] > nums2[nums2_index]){
                nums1[last_index] = nums1[nums1_index];
                nums1_index--;
            } else{
                nums1[last_index] = nums2[nums2_index];
                nums2_index--;
            }
            last_index--;
        }
    }    
}