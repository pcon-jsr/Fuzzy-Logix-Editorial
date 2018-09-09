import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        //Scanner
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); //number  of test case  
        // run loop t times
        while(t>0){
            int n=sc.nextInt(); //input the number
            //if n is divided by 2 leaves remainder 0
            //i.e., n is divisible by 2
            //i.e., n is even
            if(n%2==0){
                System.out.println("GOOD");
            }
            else{
                System.out.println("BAD");
            }
            t--;
        }
    }
}
