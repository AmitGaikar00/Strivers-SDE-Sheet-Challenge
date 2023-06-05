class Solution {
    public static void reverse(int [] permutation, int s, int e){
        while(s<e){
            
            int temp = permutation[s];
            permutation[s] = permutation[e];
            permutation[e] = temp;
            s++;
            e--;
        }    
    }
    
    public void nextPermutation(int[] permutation) {
        if(permutation.length <= 1) return ;
        int idx = -1;
        int idx2 = -1;
        int n = permutation.length;

        // find breaking point 
        for(int i=n-2 ;i>=0 ; i--){

            if(permutation[i] < permutation[i+1]){
                idx = i;
                break;
            }
        }

        // corner case 
        if(idx == -1){
            reverse(permutation, 0, n-1);
            System.out.println(permutation);
            return;
        }
        
        // find next greater and swap
        for(int i= n-1 ; i>=idx; i--){
            if(permutation[i] >permutation[idx]) {
                idx2 = i;
                break;
            }
        }
        
        // swap 
        int temp = permutation[idx];
        permutation[idx] = permutation[idx2];
        permutation[idx2] = temp;

        // reverse idx + 1 to end
        reverse(permutation, idx+1, n-1);
        System.out.println(permutation);
    
    }
    
    
}