/*
CHOCOLATE WAR

Nikita and Siddhi are best friends but they turn into deadliest enemies when it comes to chocolates.
Nikita has X chocolates while Siddhi has Y.
In order to help them, Rashi ,their common friend has a plan.
They decided that whoever has lesser number of chocolates eats as many chocolates as she has from the other's collection. This war continues till either they have the same number of chocolates, or at least one of them is left with no chocolates.
Can you help Rashi predict the total no of chocolates they'll be left with at the end of their war?

INPUT FORMAT:
The first line of input file contains the number of test cases 'T'.
Now each testcase contains of a single line of input, which contains two integers X,Y ,the no of chocolates Nikita and Siddhi have, respectively.

CONSTRAINTS:
1 <= T <= 10^5
0 <= X,Y <= 10^18

OUTPUT FORMAT:
For each testcase, output in a single line, the no of chocolates that remain after Nikita and Siddhi stop fighting.

SAMPLE INPUT 
2
54 100
88 80
SAMPLE OUTPUT 
4
16

Time Limit:	1.0 sec(s) for each input file.
Memory Limit:	256 MB
Source Limit:	1024 KB
*/


/*
SOLUTION:
Subtracting a lesser number say 'b' from a larger number say 'a'
until b becomes larger than a,
will end when a is reduced to a%b.
(THINK ABOUT THE ABOVE STATEMENT AND TRY IT OUT WITH DIFFERENT VALUES OF a & b)
So, the war will end in two cases:
1. If one of them already has 0 chocolates, the answer is the non-zero one

2. If not, the war will continue in the same way
euclidean algorithm for finding HCF/GCD works.
See this link and comeback
http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html 
That is, both numbers reuduce each other by division until one becomes zero.
BUT THERE IS A CATCH;
before one number reduces to 0, both the elements will be same which will be equal
to the greatest common divisor/highest common factor. 
(TRY IT OUT WITH DIFFERENT VALUES OF a & b)
So, the answer will be 2*GCD
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

class TestClass {
    //finds GCD of two numbers
    // if you don't understand the code visit this link:  https://www.geeksforgeeks.org/euclidean-algorithms-basic-and-extended/
    public static long GCD(long X,long Y){
        if(Y==0)    return X;
        else        return GCD(Y,X%Y);
    }
    
    public static void main(String args[] ) throws Exception {
        
        //Scanner
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();//number of test cases
        while(t>0){
            long X,Y;//can be 10^18 so long is used
            X=sc.nextLong();
            Y=sc.nextLong();
            
            if(X==0 || Y==0){
                //if any one of them has already 0 chocolates, then the fight ends
                //answer is the non zero value which is maximum of the two
                System.out.println(Math.max(X,Y));
            }
            else{
                //otherwise both will reach to equal number of chocolates at the end 
                //which is equal to the HCF/GCD
                //the answer will be 2*GCD 
                long gcd=GCD(X,Y);
                System.out.println(2*gcd);
            }
            t--;
        }
        
    }
}
