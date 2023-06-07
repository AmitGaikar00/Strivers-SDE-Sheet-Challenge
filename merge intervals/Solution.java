class Solution {
    public class Pair{
       int st;
       int et;
        
        public Pair(int  st , int et){
            this.st = st;
            this.et = et;
        }
    }
    
    public int[][] merge(int[][] intervals) {
        // sort the array based on stime 
        
        Arrays.sort( intervals , Comparator.comparingInt(a -> a[0]) );
        
        // create new stack
        Stack <Pair> stack = new Stack<>();
        Pair sp = new Pair(intervals[0][0] , intervals[0][1]);
        
        // push 1st array pair to stack
        stack.push(sp);
        
        
        // loop from 1 to n
        for(int i =1 ; i < intervals.length ; i++ ){
            // condition to push and pop from stack
             if(intervals[i][0] <= stack.peek().et){
                 Pair p = stack.pop();
                 p.st = Math.min(p.st , intervals[i][0]);
                 p.et = Math.max(p.et , intervals[i][1]);
                 stack.push(p);
             }else{
                 Pair np = new Pair(intervals[i][0], intervals[i][1]);
                 stack.push(np);
             }    
            
        }
        int n = stack.size();
        // create 2d array for copying 
        int ans[][] = new int[n][2];
        int k =0;
        
        // copy the data into 2d array
        while(!stack.empty()){
           Pair p = stack.pop();
           ans[k][0] = p.st;
           ans[k][1] = p.et;
           k++;
        }
        
        return ans;
    }
}