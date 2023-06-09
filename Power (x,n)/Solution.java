class Solution {
//     public double findPower(double x , int n){
//         if( n == 0){
//            return 1;
//         }
        
//         double p = findPower(x , n/2);
//         p = p * p;
//         if(n % 2 != 0){
//             p = p * x;
//         }
//         return p ;

//     }
    
    public double myPow(double x, int n) {
        long nn = n;
        
        // double ans = findPower(x , nn);
        if(nn < 0) nn *= -1;
        
        double ans = 1.0;
        
        while(nn > 0){
            if(nn %2 ==1){
              ans = ans * x;
              nn--;
            }else{
              x = x * x;
              nn = nn / 2 ;
            }
            
        }
        
        if(n < 0){
           return 1.0/ans;
        }else{
            return ans;
        }
        
        
    }
}