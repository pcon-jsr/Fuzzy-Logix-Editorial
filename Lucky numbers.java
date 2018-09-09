/*
Lucky Number

Saif is a CSE guy who always disturbs the class. One day his teacher wants to punish him but Saif asks for forgiveness. His teacher gives him an array of integers and tells him to find count of Lucky numbers. If Saif tells the correct answer, he will not be punished.
A number is called Lucky number if it can be represented as the sum of first k natural numbers. For example 10 is a Lucky number because it can be written as sum of first four natural numbers that is 1+2+3+4=10.
Since Saif is not good at Competitive Programming so he asked for your help.

Input:
The first line of input contains the only integer N denoting the number of integers in the array.
Second line contains contains N integers denoting the elements of the array.

Output:
Print a single integer denoting the count of the Lucky numbers in the array.

Constraints:
1 ≤ N ≤ 10^5
1 ≤ elements ≤ 10^8

SAMPLE INPUT 
5
10 12 15 18 20
SAMPLE OUTPUT 
2

Explanation
10 is sum of first 4 natural numbers and 15 is sum of first 5 natural numbers. So the answer is 2.

Time Limit: 1.0 sec(s) for each input file.
Memory Limit:   256 MB
Source Limit:   1024 KB
*/

/*
SOLUTION
We know that a number 'x' is the sum of natural numbers if
x is in the form n*(n+1)/2
i.e., 2*x is in the form n*(n+1)
i.e., 2*x is in the form product of two ALMOST EQUAL numbers
i.e., The two ALMOST EQUAL integer numbers are close to the square root of 2*x
(say 2*x=a*b where a and b are n and n+1)
NOTE: since a and b has to be in the form of product of two integers both MUST be of form of integer
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        //Scanner
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //size of array
        //int ar[]=new ar[n]; do we REALLY need this?
        int i,ans=0;
        //i is for loop & ans is for answer
        for(i=0;i<n;i++){
            int x=sc.nextInt();// the number to be checked
            x=x*2; // made x -> 2*x
            int a=(int)Math.sqrt(x);// it MUST be integer so type-casting is done
            //also since a is type-casted, it is samller number
            if(a*(a+1)==x)   ans++;
        }
        System.out.println(ans);
        
    }
}
