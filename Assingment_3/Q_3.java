package Assingment_3;
import java.util.*;
class student {
    int marks;

    void set(int m) {
        marks = m;
    }

    void display() {
        try {
            if (marks >100) {
                throw new IllegalArgumentException();
            }else{
                System.out.println("Enter the marks to display " + marks);
            }
            
        } catch (IllegalArgumentException e) {
            System.out.println("enter markes between 0 to 100 , marksOutOfBond error");
            
        }
        
           
    }
}

public class Q_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        student s = new student();
        s.set(m);
        s.display();
    }

}
