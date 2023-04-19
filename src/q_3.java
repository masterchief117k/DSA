/*Question-3: 
 
Write a java program to check whether a number is a spy number or not.  
 
Example: 
 
N = 132 
Sum of digit of N = 1 + 3 + 2 = 6 
Product of digit of N = 1 × 3 × 2 = 6 
So, 132 is a spy number. 
 
Sample Run: 
 
Enter a number: 1124 
1124 is a spy number
 */

import java.util.*;

public class q_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = n;
        int sum = 0;
        int pro = 1;
        while (n > 0) {
            int a = n % 10;
            n /= 10;
            sum += a;
            pro *= a;
        }
        if (sum == pro) {
            System.out.println("the number is a spy number " + n1);
        } else {
            System.out.println("the number is not a spy nmber " + n1);
        }
    }

}
