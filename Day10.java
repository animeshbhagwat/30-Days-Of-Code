//Day 10: Binary Numbers
import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int b=0,max=0,c=0;
        while(n>0) {
            int u=n%2;
            //b=b*10+u;
            if(u==1) {
                c++;
                if(max<c) {
                    max=c;
                }
            } else {
                c=0;
            }
            n=n/2;
        }
        System.out.println(max);
        sc.close();
    }
}