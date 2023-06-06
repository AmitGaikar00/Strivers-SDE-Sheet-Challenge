class Solution {
    public void swap(int [] arr , int s ,int e){
          int t = arr[s];
          arr[s] = arr[e];
          arr[e] = t;
    }
    
    public void sortColors(int[] nums) {
        
//         int k =0;
//         int zeroes = 0;
//         int one = 0;
//         int two = 0;
        
//         for(int v : nums){
//             if(v == 0)zeroes++;
            
//             if(v == 1) one++;
            
//             if(v == 2) two++;
//         }
        
//         for(int i =0 ; i < zeroes ;i++){
//            nums[k++] = 0;
//         }
        
//         for(int i =0 ;i < one ;i++){
//            nums[k++] = 1;
//         }
        
//         for(int i =0 ; i< two ;i++){
//            nums[k++] = 2;
//         }
        
          // three pointer 
         // 0 - low-1 -> 0
         // low - mid-1 -> 1
         // mid - high-1 -> 0/1/2 
         // high - n-1 -> 2
        
         int low =0;
         int mid = 0;
         int high = nums.length -1 ;
        
         while( mid <= high){
             if(nums[mid] == 1){
                 mid++;
             }else if(nums[mid] == 0){
                 swap(nums , low , mid);
                 low++;
                 mid++;
             }else{
                 swap(nums , mid , high);
                 high--;
             }
         }
        
    }
}