import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static BigInteger factorial(BigInteger n){
        if(n.equals(BigInteger.valueOf(0)) || n.equals(BigInteger.valueOf(1))) return BigInteger.valueOf(1);
        return n.multiply(factorial(n.add(BigInteger.valueOf(-1))));        
    }
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int number = p.nextInt();
        
        BigInteger f = BigInteger.valueOf(number);
        System.out.println(factorial(f));
        
    }
}
