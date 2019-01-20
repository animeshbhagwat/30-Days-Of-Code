//Day 18: Queues and Stacks
import java.util.*;

class Solution {

    private LinkedList <Character> queue,stack;
    
    Solution() {
        queue = new LinkedList<Character>();
        stack = new LinkedList<Character>();
    }
    
    boolean isQueueEmpty() {
        if (queue.size()==0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isStackEmpty() {
        if (stack.size()==0) {
            return true;
        } else {
            return false;
        }
    }

    void pushCharacter(char c) {
        stack.addFirst(c);
    }

    char popCharacter() {
        if(isStackEmpty()) {
            return '$';
        }
        char c = (char)stack.getFirst();
        return c;
    }

    void enqueueCharacter(char ch) {
        queue.addLast(ch);
    }

    char dequeueCharacter() {
        if(isQueueEmpty()) {
            return '$';
        }
        char c = (char)queue.getFirst();
        return c;
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