 # Count inversions in an array #

Problem Statement: Given an array of N integers, count the inversion of the array (using merge-sort).
What is an inversion of an array? Definition: for all i & j < size of array, if i < j then you have to find pair (A[i],A[j]) such that A[j] < A[i].

<br/>
Example 1:
<br/>
Input Format: N = 5, array[] = {1,2,3,4,5}
<br/>
Result: 0
<br/>
Explanation: we have a sorted array and the sorted array 
has 0 inversions as for i < j you will never find a pair 
such that A[j] < A[i]. More clear example: 2 has index 1 
and 5 has index 4 now 1 < 5 but 2 < 5 so this is not an 
inversion.
<br/>

Example 2:
<br/>
Input Format: N = 5, array[] = {5,4,3,2,1}
<br/>
Result: 10
<br/>
Explanation: we have a reverse sorted array and we will 
get the maximum inversions as for i < j we will always 
find a pair such that A[j] < A[i]. 
Example: 5 has index 0 and 3 has index 2 now (5,3) pair 
is inversion as 0 < 2 and 5 > 3 which will satisfy out 
conditions and for reverse sorted array we will get 
maximum inversions and that is (n)*(n-1) / 2.

For above given array there is 4 + 3 + 2 + 1 = 10 inversions.

<br/>
Example 3:
<br/>
Input Format: N = 5, array[] = {5,3,2,1,4}
<br/>
Result: 7
<br/>
Explanation: There are 7 pairs (5,1), (5,3), (5,2), (5,4),
(3,2), (3,1), (2,1) and we have left 2 pairs (2,4) and 
(1,4) as both are not satisfy our condition. 