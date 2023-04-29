/*Create an abstract class Shape and the derived classes Square, Triangle and Circle. Write a 
java program to display area of different shapes
 */

package as2;

import java.util.*;
public class Shape {
    abstract class shape{
        abstract double area();
    }
    class square extends shape{
        double side;
        square(double side){
            this.side=side;
        }
        double area(){
            return side*side;
        }
    }
    class triangle extends shape{
        double height ;
        double base;
        triangle(double  height ,double base){
            this.height = height;
            this.base=base;
        }
        double area(){
          return (height*base*0.5);
        }
    }
    class circle extends shape{
        double radius;
        circle(double radius){
          this.radius=radius;
        }
        double area(){
            return (Math.PI *radius*radius);
        }
    }
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the side , height , base , radius for the shapes");
        double s= sc.nextDouble();
        double h= sc.nextDouble();
        double b= sc.nextDouble();
        double r= sc.nextDouble();
        Shape sa=new Shape();
        square square=sa.new square(s);
        System.out.println("The area of Square is : "+square.area());
        triangle triangle = sa.new triangle(h, b);
        System.out.println("The area of triangle is :"+triangle.area());
        circle circle =sa.new circle(r);
        System.out.println("The area of circle is : " + circle.area());
        sc.close();
    }
}
