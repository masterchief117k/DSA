/*Question-3: 
 
Define a class called Student with instance variables Roll, Name, DSA_Mark. Also, the class 
consists of instance methods getdata( ), showdata( ) to provide input to the instance variable 
and to display the value of instance variable. Write a program to create the details of 5 students. 
Display the information of the students who has secured the highest DSA_Mark.
 */

package as2;
import java.util.*;
public class student {
    private int roll ;
    private String Name;
    private double marks;
    public void getdata(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter name roll number and marks of student");
       String n=sc.nextLine();
        int r=sc.nextInt();
        double m=sc.nextDouble();
        this.roll = r;
        this.Name=n;
        this.marks=m;
    }
    public void showdata(){
        System.out.println("roll number : "+roll+" name : "+Name+" marks "+marks);
    }
    public double getmarks(){return marks;}
    public static void main(String[] args){
        student[] s =new student[5];
        for ( int i = 0; i < s.length; i++){
            s[i]=new student();
            s[i].getdata();
        }
        double max=s[0].getmarks();
        int index=0;
        for (int i =0; i<5;i++){
            if(s[i].getmarks()>max){
               max=s[i].getmarks();
               index=i;
            }
        }
         System.out.println("Student with highest marks ");
         s[index].showdata();
    }
    }


