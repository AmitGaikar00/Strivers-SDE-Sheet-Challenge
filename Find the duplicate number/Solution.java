class Solution {
    public int findDuplicate(int[] arr) {
         
//           int arr [] = new int[nums.length];
//           for(int v : nums){
//               arr[v]++;
//           }
          
//           for(int i=0; i< arr.length ;i++){
//               if(arr[i] > 1){
//                   return i;
//               }
//           }
//           return -1;
          // Set<Integer>  set = new HashSet<>();
          //   int mis =0;
          //   for(int i=0; i<nums.length;i++){
          //      if(set.contains(nums[i])){
          //         mis = nums[i];
          //         break;
          //      }else{
          //        set.add(nums[i]);
          //      }
          //   }
          //   return mis;
        
          int slow = arr[0]; 
          int fast = arr[0];
          
         do{
             slow = arr[slow];
             fast = arr[arr[fast]];
         }while(slow != fast);
             
         fast = arr[0];
         
         while(slow != fast){
             slow = arr[slow];
             fast = arr[fast];
         }
        
         return slow;
    }
}