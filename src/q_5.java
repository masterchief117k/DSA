/*Question-5: 
 
Write a java method to calculate the sum of digits of a given number until the number is a 
single digit. The method signature is as follows. 
 
public static int sum_Of_Digits(int n) 
 
Example: 
  
         Let n = 9294 
         Sum = 9 + 2 + 9 + 4 = 24 
         Sum = 2 + 4 = 6 
 
Sample Run: 
 
Enter a number 9294 
Sum of digits of 9294 until the number is a single digit is 6 
 
 
 */

import java.util.*;
public class q_5 {
    public static int sum_of_Digits(int n) {
        int sum = 0;
        while (n > 0) {
            int ret = n % 10;
            n /= 10;
            if (ret <= 5) {
                sum += ret;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want : ");
        int n = sc.nextInt();
        System.out.println("teh sum first sum of digits to be single digit is "+sum_of_Digits(n));
        sc.close();
    }
}
