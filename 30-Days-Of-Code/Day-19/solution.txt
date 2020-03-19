import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        
        int sum = 0;
        for(float i=1;i<=n;i++)			//any two variables must be float/double for precision here i and div are in float thereofore ans is in float. ex n = 6 and i = 4 then div = 1.5 here ,if i was int it would result in the div - 1.0
        {
            float div = n/i;
            if(div%2==0 || div%2==1.0)
            {
                 sum = sum + (int)div;
            }
        } 
        return sum;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}