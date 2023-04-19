/*Question-2: 
 
The body mass index (BMI) is commonly used by health and nutrition professionals to estimate 
human  body  fat  in  populations.  It  is  computed  by  taking  the  individual's  weight  (mass)  in 
kilograms and dividing it by the square of their height in meters. i.e. 
Metric:  BMI = 𝑾𝒆𝒊𝒈𝒉𝒕 (𝒌𝒈)
(𝑯𝒆𝒊𝒈𝒉𝒕)𝟐 (𝒎𝟐) 
 
Write a java program by using conditional statement to show the category for a given BMI.  
 
 
Category BMI 
Less than 18.5 Underweight 
18.5 to 24.9 Normal Weight 
25.0 to 29.9 Overweight 
30.0 or more  Obese 
 
 
Sample Run-1: 
 
Enter person Weight in kg: 68 
Enter height of person in meter: 2 
The person is Underweight. 
 
Sample Run-2: 
 
Enter person Weight in kg: 96 
Enter height of person in meter: 1.4 
The person is Obese.
 */
import java.util.*;
 public class q_2 {
  public static void main(String[] args){
   Scanner sc =new Scanner(System.in);
   System.out.println("Enter your weight in kgs And height in meters ");
   double w= sc.nextDouble();
   double h= sc.nextDouble();
   double f= w/(h*h);
   if(f<18.5){
    System.out.println("The person is underweight ");
   }
   else if(f>=18.5 || f<=24.9){
    System.out.println("The person is Normal weight ");
   }
   else if(f>=25 || f<=29.9){
    System.out.println("The person is oveweight ");
   }
   else if (f>=30) {
    System.out.println("The person is obese");
   }
   else{
    System.out.println("Wrong input ");
   }
 
  }    
}
