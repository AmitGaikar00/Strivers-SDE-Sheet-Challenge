class Solution {
    public void reverse(int [] [] arr){
        for(int i=0; i<arr.length ;i++){
            int j =0 ; 
            int k =arr[0].length-1;
            
            while( j< k){
                int t = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = t;
                
                j++;
                k--;
            }
        }
    }
 
    public void rotate(int[][] matrix) {
        
        for(int i= 0; i< matrix.length ; i++){
           for(int j =0 ; j< i; j++){
               int t = matrix[i][j]; 
               matrix[i][j] = matrix[j][i];
               matrix[j][i] = t;
           }
        }
        
        reverse(matrix);
    }
}