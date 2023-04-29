package as2;

import java.util.*;

public class test {
  class stu{
    int r;
    double m;
    String n;
  
  public void  get(){
     Scanner sc = new Scanner(System.in);
     int x =sc.nextInt();
     
     double z = sc.nextDouble();
     String y= sc.nextLine();
     r=x;
     m=z;
     n=y;
  }
  public void display(){
    System.out.println("Name :"+n+" Roll number "+r+" marks "+m);
  }public double ma(){return m;}
}
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number of students");
     int c=sc.nextInt();
     test t= new test();
     stu[] arr=new stu[c];
     for(int i =0; i<c; i++){
       arr[i]=t.new stu();
       arr[i].get(); 
    }
    double max=arr[0].ma();
    int index=0;
    for(int i =0; i<c; i++){
        if(arr[i].ma()>max){
            max=arr[i].ma();
            index=i;
        }
    }
    System.out.println("The highest marks are ");
    arr[index].display();
  
 }
}
