import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int printme = 0;
        try {
            printme = Integer.parseInt(S);
            System.out.println(printme);
        }
        catch(Exception e) {
            System.out.println("Bad String");
        }
    }
}

#The main objective of this program is to take all the strings which can be parsed(change of data-type) to intger from String 
#if it is of the form of "1234" or any string with only numbers but if there are any strings like "abc" format , it'll raise an
#error which needs to be catched. We do the parsing from string token to integer using Integer.parseInt(String Token) and catch the
#exceptions using try { } and exception(exceptionname var){ }.
