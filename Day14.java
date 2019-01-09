//Day 14: Scope
import java.util.*;
import java.math.*;

class Difference {
  	private int[] elements;
  	public int maximumDifference;
    Difference(int a[]) {
        int n=a.length;
        elements = new int[n];
        for (int i = 0; i < n; i++) {
            this.elements[i] = a[i];
        }
    }

    void computeDifference() {
        // complexity of O(n^2)
        // maximumDifference = Integer.MIN_VALUE;
        // for (int i = 0; i < elements.length; i++) {
        //     for (int j = 0; j < elements.length; j++) {
        //         int diff=Math.abs(elements[i]-elements[j]);
        //         if(diff>maximumDifference) {
        //             maximumDifference = diff;
        //         } 
        //     }
        // }

        //complexity of O(n)
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n = elements.length;
        for(int i=0; i<n; i++) {
            if (elements[i]>max) {
                max=elements[i];
            }
            if (elements[i]<min) {
                min=elements[i];
            }
        }
        maximumDifference = max-min;
    }
}
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}