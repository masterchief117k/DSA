/*Question-1: 
 
Write a Java program that can take a positive integer greater than 2 as input and write out the 
number  of  times  one  must  repeatedly  divide  this  number  by  2  before  getting  a  value  less 
than 2. 
 
Sample Run: 
 
The positive integer greater than 2 from command line argument 
is 67. 
The number of times one must repeatedly divide this number by 2 
before getting a value less than 2 is 5.
 */
public class q_1 {
    public static void main(String[]args){
     int n = Integer.parseInt(System.console().readLine());
     int count=0;
    while(n>2){
        n/=2;
        count++;
    }
     System.out.println(count);
    }
}
