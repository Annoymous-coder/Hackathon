
import java.util.*;
class solutionNaive {
    public static void main(String args[] ) throws Exception {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter no of test cases");
       int T = sc.nextInt();
       while(T>0)
       {   System.out.println("Enter range i.e L and R");
           long L = sc.nextInt();
           long R = sc.nextInt();
           long sum = 0, avg =0;
           long n = R - L + 1;
           for(long i = L;i<=R;i++)
           {
            sum = sum + i;
            avg = sum / n;
           }
           System.out.println("The avg for "+L+" and "+R);
           System.out.println(avg);
           T--;
       }

    }
}
//This naive method takes too long to execute since each of the nos in the specified range will be added.So it is highly time complexive.
