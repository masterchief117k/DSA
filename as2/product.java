package as2;
/*Define  a  class  called  product.  Two  instance  variables  of  the  class  are  pid  (product-id)  and 
price (product price). It consists of one static variable tot_price (total price). Initialize the value 
of instance variables through parameterized constructor. It consists of a display ( ) method to 
display  the  value  of  instance  variables.  A  person  went  to  market  and  purchase  5  different 
products. Using the above mentioned class, display the details of products that the person has 
purchased. Also, determine how much total amount the person will pay for the purchase of 5 
product
 */
import java.util.*;
public class product {
    double  price;
    static double tot_price;
    public void setPrice(double p) {
      price = p ;
      tot_price+=p;
    }
    public void display() {
       System.out.println("The cost of item is "+price);
    }
    public static void main(String[] args) {
        product c =  new product();
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<5;i++ ){
            int n= sc.nextInt();
            c.setPrice(n);
            c.display();
        }
       System.out.println("The total price is "+ tot_price);
       sc.close();
    }
    
}