/*Question-8: 
Write  a  java  program  to  print  M-by-N  array  in  the  tabular  format.  Also,  display  the  sum  of 
elements of the array.  
 
Sample Run: 
Enter number of Row and Columns of 2D-Array: 3 3 
Enter elements of 2D-Array: 1 2 3 2 3 4 3 4 5 
The elements of 2D array are: 
1 2 3
2 3 4
3 4 5
 
 
The sum of elements of the 2D-Array is 27 
 */
import java.util.*;
 public class q_8 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of row and column ");
       int m = sc.nextInt();
       int n= sc.nextInt();
       int sum=0;
       int [] [] arr= new int[m][n];
       System.out.println("Enter the elements you want to enter: ");
       for(int i=0; i<arr.length; i++){
           for(int j=0; j<arr.length; j++){
               arr[i][j]= sc.nextInt();   
               sum+=arr[i][j];
        }
       }
       System.out.println("The the 2 d array is ");

       for(int i=0; i<m; i++){
        for (int j=0; j<n; j++){
           System.out.print(arr[i][j]+" ");
        }     
        System.out.println(" ");
       }
       System.out.println("The sum of elements are :"+sum);
      
    }
}