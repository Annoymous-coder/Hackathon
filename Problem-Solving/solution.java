
import java.util.*;
class solution {
    public static void main(String args[] ) throws Exception {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter no of test cases");
       int T = sc.nextInt();
       while(T>0)
       {   System.out.println("Enter range i.e L and R");
           long L = sc.nextInt();
           long R = sc.nextInt();
           long avg = 0;
           avg = (L+R)/2;
           System.out.println("The avg for "+L+" and "+R);
           System.out.println(avg);
           T--;
       }

    }
}

