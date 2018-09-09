/*Palindrome
Max. Marks: 75
Saif buys a string and decides to make the string palindrome by rearranging the characters of the string.
Output if it is possible or not.

Input:
The first and only line of input contains a string.
Output:
If it is possible to make the string palindrome by rearranging the characters of the string then print “Congratulations” otherwise print “BetterLuckNextTime” (Quotes are only for clarification).
Note:
Characters are lowercase i.e(from 'a' to 'z')
Constraints:
1 < Length of string <= 106
String consists of only lowercase english alphabets.

SAMPLE INPUT 
abcadbc
SAMPLE OUTPUT 
Congratulations
Explanation
abcadbc can be rearranged to abcdcba to form a palindrome.

Time Limit: 1.0 sec(s) for each input file.
Memory Limit:   256 MB
Source Limit:   1024 KB
*/

/*
SOLUTION
Given a string. 
Let's try to make a it a palindrome because order/permutaion doesn't matter.
Lets analyse each character.
Characters which are even in number (called even characters) can be made into a palindrome
because half can be put to left side and half on the right side.
Characters which are odd in number (say odd characters) can not be distributed in this way.
The only way we can distribute odd characters is to put them in the middle.
Since there is only one mid-point in the string, we can have ATMOST one odd set character.
If all these satisfy, we can make a palindrome
else it is impossible
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        //Scanner
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        int hash[]=new int[26];
        //keep count of each character from a-z in hash[]
        //0th index for the count of 'a'
        //1st index for the count of 'b'
        //2nd index for the count of 'c'.............25th index for the count of 'z'
        int i,l=s.length();
        //i for loop; l for length
        
        //run loop for initialising the hash array to 0 
        for(i=0;i<26;i++){
            //count of i-th character is 0 now
            hash[i]=0;
        }
        
        //run loop for length of string
        for(i=0;i<l;i++){
            //s.charAt(i) is the i-th character of string
            //index in the hash array= ASCII value of the character - 97 ('a')
            hash[(s.charAt(i)-'a')]++;//increase the count of that character in the array
        }
        
        int oddCount=0;//keep count of odd characters
        //run loop from a to z
        for(i=0;i<26;i++){
            //check if the count i-th character is even or odd
            if(hash[i]%2==1){
                //if it is odd then increment the count of odd characters 
                oddCount++;
            }
            //if the count of odd characters is greater than 1 end loop
            if(oddCount>1)  break;
        }
        //if i ends normally then i=26 at the end
        if(i==26)       System.out.println("Congratulations");
        //if not, loop breaks before i become 26
        else            System.out.println("BetterLuckNextTime");
    }
}
