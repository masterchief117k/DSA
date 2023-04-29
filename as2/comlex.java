
/* Define  a  class  called  Complex  with  instance  variables  real,  imag  and  instance  methods 
setData(), display(), add(). Write a Java program to add two complex numbers. 
 
The prototype of add method is:  
 
public Complex add(Complex, Complex)*/
package as2;

import java.util.*;

public class comlex {
    public int z;
    public int r;

    public void set(int rel, int i) {
        r = rel;
        z = i;
    }

    public void display() {
        System.out.println("real" + r + " imaginary " + z);

    }

    public comlex add(comlex c1, comlex c2) {
        comlex sol = new comlex();
        sol.r = c1.r + c2.r;
        sol.z = c1.z + c2.z;
        return (sol);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        comlex c1 = new comlex();
        comlex c2 = new comlex();
        System.out.println("Enter the first complex number ");
        int s = sc.nextInt();
        int si = sc.nextInt();
        System.out.println("Enter the second comlex number ");
        int s1 = sc.nextInt();
        int si1 = sc.nextInt();
        c1.set(s, si);
        c2.set(s1, si1);
        comlex rel = c1.add(c1, c2);
        rel.display();
        sc.close();
    }
}
