package practice;
import java.util.Scanner;
public class RecursiveSolution {

    public int getfibo(int n)
    {
        int a = 0;
        int b = 1;

        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else 
            return getfibo(n-1) + getfibo(n-2);
    }

    public static void main(String args[])
    {   
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the nth index position of a fibonacci Sequence");
        //Index of the fibonacci sequence . i.e Ex first n fibonacci numbers.
        int n = sc.nextInt();


        RecursiveSolution obj = new RecursiveSolution();
        
        long pretime = System.currentTimeMillis();
        	System.out.println(obj.getfibo(n));
        long posttime = System.currentTimeMillis();
        System.out.println("Time taken to complete Recursively is " + (posttime - pretime));
        
        sc.close();
    }
}
//LOGIC IS TO USE STACK BASED RECURSION.
//IT WORKS FAST ONLY WITH SMALLER INPUTS AS THE INPUT GROWS THE TIME COMPLEXITY INCREASES VERY FAST AND CODE O/P BECOMES SLOW.
//LARGER INPUTS CANT BE HANDLED AS STACK HAS A LIMIT ON 1000.
//THIS IS VERY SIMILAR TO FACTORIAL OF A NUMBER.

//EX: FOR FIBO(5) 
//CHECK IF N = 0 OR N = 1 ELSE ADD FIB(4) AND FIB(3) FIRST FIB(4) IS ADDED INTO THE STACK TO ACT LIKE SUBFUNCTION AND THEN FIB(3).
//ADD FIBO(4) TO STACK -> ADD FIB(3) -> ADD FIB(2) --> ADD FIB(1) --> FIB(0)  SO FOR FIB(4) WE HAVE 0 + 1 + 1 + 2
//ADD FIB(3) TO STACK -> ADD FIB(2) -> FIB(1) -> ADD FIB(0) SO TO FIND OUT WE FIB(3) WE HAVE 0 + 1 + 1

//WE SEE THAT FOR BOTH FIB(4) AND FIB(3) THE STEPS ARE REPEATED AND FIB(3)'S ANSWER COULD HAVE BEEN USED FOR FIB(4) SO WE USE MEMOIZATION IN NEXT STEP
