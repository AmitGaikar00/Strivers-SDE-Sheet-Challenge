class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
//         int i =0; 
//         int j = matrix[0].length-1;
        
        
//          while(i < matrix.length && j >= 0 ){
//              if(matrix[i][j] == target){
//                 return true;
//              }else if(matrix[i][j] < target){
//                  i++;
//              }else{
//                  j--;
//              }
//          }
        
//         return false;
        
        
        int low =0;
        int n = matrix.length;
        int m = matrix[0].length;
        int high = (n * m )- 1 ;
        
        if(n == 0) return false;
        
        while(low <= high){
            int mid = (low+high) /2;
            if(matrix[mid/m][mid%m] == target){
                return true;
            }else if(matrix[mid/m][mid%m] < target){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        
        return false;
    }
}