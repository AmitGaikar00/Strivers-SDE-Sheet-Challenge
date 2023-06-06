class Solution {
    public int maxSubArray(int[] nums) {
		// kadane algorithms
        int max_so_far = Integer.MIN_VALUE;
        int max_ending = 0;
        
        for(int v : nums){
            max_ending += v;
            
            max_so_far = Math.max(max_so_far , max_ending);
            
            if(max_ending <0) max_ending =0;
            
        }
        
        return max_so_far;
        
    }
}