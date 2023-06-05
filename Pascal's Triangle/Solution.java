import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> pascal = new ArrayList<>();

	    for(int i = 0 ;i < n ; i++){
           	 long val = 1;
	         ArrayList<Long> arr = new ArrayList<>();
			
             for(int j=0; j<=i ;j++){
		    	arr.add(val);
				// ncr formula to ncrp1 = ncr*(n-r) / (r+1)
                val = (val *(i-j))/ (j+1);		
             }
		    pascal.add(arr);
    	}

	    return pascal;

	}
}

