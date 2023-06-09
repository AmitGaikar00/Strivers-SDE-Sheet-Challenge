class Solution {
    
    public List<Integer> majorityElement(int[] v) {

        
//         HashMap<Integer, Integer> map = new HashMap<>();
        
//         List<Integer> ans = new ArrayList<>();
//         if(nums.length == 1){
//             ans.add(nums[0]);
//             return ans;
//         }
        
        
//         for(int v : nums){
//             map.put(v , map.getOrDefault(v , 0) + 1);
//         }
        
//         for(int key : map.keySet()){
//             if(map.get(key) > nums.length/3) {
//                 ans.add(key);
//             } 
//         }
        
//         return ans;
        int n = v.length; //size of the array

        int cnt1 = 0, cnt2 = 0; // counts
        int el1 = Integer.MIN_VALUE; // element 1
        int el2 = Integer.MIN_VALUE; // element 2

        // applying the Extended Boyer Moore's Voting Algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt1 == 0 && el2 != v[i]) {
                cnt1 = 1;
                el1 = v[i];
            } else if (cnt2 == 0 && el1 != v[i]) {
                cnt2 = 1;
                el2 = v[i];
            } else if (v[i] == el1) cnt1++;
            else if (v[i] == el2) cnt2++;
            else {
                cnt1--; cnt2--;
            }
        }

        List<Integer> ls = new ArrayList<>(); // list of answers

        // Manually check if the stored elements in
        // el1 and el2 are the majority elements:
        cnt1 = 0; cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == el1) cnt1++;
            if (v[i] == el2) cnt2++;
        }

        int mini = (int)(n / 3) ;
        if (cnt1 > mini) ls.add(el1);
        if (cnt2 > mini) ls.add(el2);

        // Uncomment the following line
        // if it is told to sort the answer array:
        //Collections.sort(ls); //TC --> O(2*log2) ~ O(1);

        return ls;
           
    }
}