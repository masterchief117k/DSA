
/*Question-9: 
 
Write  a  Java  program  to  declare  a  Class  named  as  Student  which  contains  roll  number, 
name  and  course  as  instance  variables  and  input_Student  ()  and  display_Student  ()  as 
instance  methods.  A  derived  class  Exam  is  created  from  the  class  Student.  The  derived 
class  contains  mark1,  mark2,  mark3  as  instance  variables  representing  the  marks  of  three 
subjects  and  input_Marks  ()  and  display_Result  ()  as  instance  methods.  Create  an  array  of 
objects of the Exam class and display the result of 5 students. 
*/
import java.util.*;

class student {
    int roll;
    String name;
    String course;

    public void display_Student() {
        System.out.println("Roll number: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }

    public void input_student() {
        System.out.println("Enter name student , roll no , course ");
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        int r;
        String n;
        String c;
        n = sc.nextLine();
        r = sc.nextInt();
        c = sc.next();
        roll = r;
        name = n;
        course = c;
       
    }
   
}

class exam extends student {

    int mark1;
    int mark2;
    int mark3;

    public void display_Result() {

        System.out.println("Mark1: " + mark1);
        System.out.println("Mark2: " + mark2);
        System.out.println("Mark3: " + mark3);
    }

    public void input_Marks() {
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter the marks of subject 1 2 and 3");
        int m1 = s2.nextInt();
        int m2 = s2.nextInt();
        int m3 = s2.nextInt();
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;

    }
    
}

public class stu {
    public static void main(String[] args) {
        exam[] arr = new exam[2];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new exam();
            arr[i].input_student();
            arr[i].input_Marks();
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i].display_Student();
            arr[i].display_Result();
        }
    }
   
}