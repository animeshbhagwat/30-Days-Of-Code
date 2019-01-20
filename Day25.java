//Day 25: Running Time and Complexity
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if(num==2) {
                System.out.println("Prime");
            } else if(num==1 || num%2==0) {
                System.out.println("Not prime");
            } else if(isPrime(num)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
        sc.close();
    }

    static Boolean isPrime(int num) {
        int root = (int)Math.sqrt(num);
        for (int i = 3; i <= root; i+=2) {
            if(num%i==0){
                return false;    
            }
        }
        return true;
    }
}
