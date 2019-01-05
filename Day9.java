//Day 9: Recursion 3
import java.util.*;

class Solution {
    static int factorial(int n) {
        if(n<1){
            return 1;
        } else {
            return (n*factorial(n-1));
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = factorial(n);
        System.out.println(result);
        scanner.close();
    }
}