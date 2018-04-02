import java.io.*;
import java.util.*;

public class Solution {
    // Initalize a stack and queue instance
    Stack<Character> myStack = new Stack<Character>();
    Queue<Character> myQueue = new LinkedList<Character>();
    
    // pushes a character onto a stack
    void pushCharacter(char ch){
        this.myStack.push(ch);
    }
    
    // add to queue instance
    void enqueueCharacter(char ch){
        this.myQueue.add(ch);
    }
    
    // pops and returns the character at the top of the stack instance variable
    char popCharacter(){
        return this.myStack.pop();
    }
    
    // dequeues and returns the first character in the queue instance variable
    char dequeueCharacter(){
        return this.myQueue.remove();
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