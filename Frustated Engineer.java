/*Frustated Engineer
Max. Marks: 60
There used to be a frustrated engineer named Tony. One day his friend who is very ground to earth approached him for help. He asked his witty friend Tony to decrease a number by one. But Tony being frustrated does it in a wrong way. Tony subtracts one from a number by the following algorithm:

if the last digit of the number is non-zero, he decreases the number by one;
if the last digit of the number is zero, he divides the number by 10 (i.e. removes the last digit).
You are given an integer number N. Tony will subtract one from it K times. Your task is to print the result.

INPUT:
The only line of the input contains two integers N and K. The number from which Tony will subtract and the number of subtraction he will perform.
CONSTRAINTS:
1 <= N <= 10^9
1 <= K <= 50
OUTPUT:
Print one integer — the result of decreasing N by one K times.
Note: It is guaranteed that the result will always be a non-negative integer number.
SAMPLE INPUT 
2612 4
SAMPLE OUTPUT 
260
Explanation
The example corresponds to the following sequence: 

2612→2611→2610→261→260

Time Limit:	1.0 sec(s) for each input file.
Memory Limit:	256 MB
Source Limit:	1024 KB
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        //Scanner
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                 
        int k = sc.nextInt();
        //run the loop k times
        while(k>0){
            //if last digit is 0
            if(n%10==0){
                //divide by 10 to remove 0 at last
                n=n/10;
            }
            else{
                //decrease by 1
                n=n-1;
            }
            k--;
        }
        System.out.println(n);
    }
}