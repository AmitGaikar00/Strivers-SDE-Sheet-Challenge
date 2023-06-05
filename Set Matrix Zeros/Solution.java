import java.io.*;
import java.util.* ;

public class Solution {

    public static void setZeros(int matrix[][]) {
        
        int colzero = 1;
        
        // traverse throught matrix one by one 
        // instead of creating 2 separate array to store 0 row and column
        //  use first row and first column 
        for(int i=0 ;i < matrix.length ;i++){
            for(int j=0; j< matrix[0].length ;j++){
                if(matrix[i][j] == 0){
                    
                    // make first row zero
                    if(j!= 0){
                        matrix[0][j] = 0;
                    }else{
                        colzero =0;
                    }
                    // make first column zero
                    matrix[i][0] = 0;
                } 
            }
        }

        // from 1st row to 1st col make element zeroes based on starting row and column
        for(int i=1 ;i < matrix.length ;i++){
            for(int j=1; j< matrix[0].length ;j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        
        // check first column
        if(matrix[0][0] == 0){
            for(int j=0; j<matrix[0].length; j++){
                matrix[0][j] = 0;
            }
        }
        
        // check first row 
        if(colzero == 0){
            for(int i=0; i<matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
        
    }

}

