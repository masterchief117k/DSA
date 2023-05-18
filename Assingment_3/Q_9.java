/*Question-9: 
 
The sequence of numbers 1, 1, 2, 3, 5, 8, 13 etc are called Fibonacci numbers, 
each  is  the  sum  of  the  preceding  two.  Write  a  recursive  method  in  Java  which,  given  n, 
returns the nth Fibonacci number. 
 
Sample run: 
 
Enter one number 
10 
Fibonacci number at position 10 is 55 */
package Assingment_3;

public class Q_9 {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static  void main(String[] args) {
        int n = 10;
int fib = fibonacci(n);
System.out.println("Fibonacci number at position " + n + " is " + fib);
    }
}
