import java.io.*;
import java.util.*;

//Queues and Stacks HackerRank Day-18
public class Solution {
    // Write your code here.
    Stack<Character> p;
    Queue<Character> q;
    public Solution(){
        p  = new Stack<Character>();
        q =  new LinkedList<Character>();
    }
    
    public void pushCharacter(Character ch){
       p.push(ch);
    }
    public void enqueueCharacter(char ch){
        q.add(ch);
    }
    public char popCharacter(){
        return p.pop();
    }
    public char dequeueCharacter(){
        return q.remove();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}