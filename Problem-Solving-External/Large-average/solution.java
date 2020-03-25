
import java.util.*;
class solutionNaive {
    public static void main(String args[] ) throws Exception {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter no of test cases");
       int T = sc.nextInt();
       while(T>0)
       {   System.out.println("Enter range i.e L and R");
           long L = sc.nextLong();
           long R = sc.nextLong();
           long avg =0;
           long n = 2; //L and R
           avg = (L+R)/n;
           System.out.println("The avg for "+L+" and "+R);
           System.out.println(avg);
           T--;
       }

    }
}

