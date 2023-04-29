/*Question-1: 
 
A phone number can be thought of as having three parts: the area code, the exchange code and 
the number.  
 
Example: A phone number, such as (212) 767-8900, can be thought of as having three parts: 
the area code (212), the exchange (767) and the number (8900).  
 
Define  a  class  Phone  to  store  these  three  parts  of  a  phone  number  separately  as  instance 
variable (area_code, exchange, number). The class consists of two member methods: input ( ) 
and display ( ). Create two class objects of type phone. Initialize one directly (by using dot (.) 
operator  and  instance  variable  with  value  area_code:  212,  exchange:  767, 
number: 8900), and initialize other from the user through member method input ( ). Display 
both the numbers. 
 
Sample Run: 
 
My number is (212) 767-8900 
Your number is (415) 555-1212 */

package as2;
import java.util.*;
import java.util.Scanner;

public class phone {
    private int areaCode;
    private int exchange;
    private int number;

    public phone(int areaCode, int exchange, int number) {
        this.areaCode = areaCode;
        this.exchange = exchange;
        this.number = number;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter area code: ");
        this.areaCode = scanner.nextInt();
        System.out.print("Enter exchange code: ");
        this.exchange = scanner.nextInt();
        System.out.print("Enter number: ");
        this.number = scanner.nextInt();
    }

    public void display() {
        System.out.printf("(%d) %d-%d%n", this.areaCode, this.exchange, this.number);
    }
    public static void main(String[] args) {
        // Initialize one directly
        phone phone1 = new phone(212, 767, 8900);
    
        // Initialize other from user input
        phone phone2 = new phone(0, 0, 0);
        phone2.input();
    
        // Display both numbers
        phone1.display();
        phone2.display();
    }
}

