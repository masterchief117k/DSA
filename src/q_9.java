/*Question-9: 
Write a method that sums all the numbers in the major diagonal in an n * n matrix of double 
values using the following header: 
 
public static double sumMajorDiagonal(double[][] m) 
 
Write a java program that reads a 4-by-4 matrix and displays the sum of all its elements on the 
major diagonal.  
 
Sample Run: 
 
Enter a 4-by-4 matrix row by row: 
 
1     2      3     4.0 
5     6.5   7     8 
9     10   11  12 
13   14   15  16 
Sum of the elements in the major diagonal is 34.5
 */

import java.util.*;
 public class q_9 {
    public static double sumMajorDiagonal(double[][] m){
        int sum=0;
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m.length; j++){
               if(i==j){
                 sum+=m[i][j];
               }
            }
        }
        return(sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row and column");
        int n=sc.nextInt();
        int m = sc.nextInt();
    double [] [] a= new double[m][n];
    System.out.print("Enter the elements you want");
    for(int i=0; i<a.length;i++){
        for( int j=0; j<a.length; j++ ){
            a[i][j]=sc.nextDouble(); 
        }
    }
    System.out.println("The entered 2-d array is :");
    for(int i=0; i<m; i++){
        for(int j=0;j<n;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println("The sum of digonal major is "+sumMajorDiagonal(a));
    }    
}
