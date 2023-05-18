package Assingment_3;
/*Question-8: 
 
Write  a  recursive  method  in Java  which,  given  an  integer  n,  print  it  with its  digits  reversed. 
For example, given 4735, it prints 5374 
 
Sample run: 
 
Enter the number that you want to reverse:  
3456 
The reverse of the given number is: 6543 
 */

public class Q_8 {
    public static String reverseString(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return reverseString(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String str = "12334";
        String reversed = reverseString(str);
        System.out.println(Integer.parseInt(reversed));
    }   
}
