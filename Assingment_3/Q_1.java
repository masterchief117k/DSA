/*Question-1: 
 
Write a Java program to read your lucky number from keyboard. Treat –ve no. as 
NumberFormatException. Write appropriate Exceptional handler. 
 
Sample run-1: 
Enter your lucky number 
-90 
java.lang.NumberFormatException: Negative number 
 
Sample run-2: 
Enter your lucky number 
34 
Your lucky number is 34
 */
package Assingment_3;
import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your lucky number: ");
        try {
            int luckyNumber = (sc.nextInt());
            if (luckyNumber < 0) {
                throw new NumberFormatException();
            }
            System.out.println("Your lucky number is " + luckyNumber);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a positive integer.");
        }
    }
}