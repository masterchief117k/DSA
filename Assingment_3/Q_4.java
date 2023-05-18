/*Question-4: 
 
Write  a  java  program  to  print  an  array  of  different  type  using  a  single  Generic  method.  The 
signature of printArray method is given below. 
 
public static < E > void printArray( E[] inputArray)  
 
Sample run: 
 
Enter array elements 
1 
2 
3 
4 
5 
 
Integer Array contains: 
1  2  3  4  5   
 
Enter array elements 
1.2 
2.3 
3.4 
4.5 
5.6 
 
Double Array contains: 
1.2  2.3  3.4  4.5  5.6 
 */
package Assingment_3;
    import java.util.Scanner;

public class Q_4 {
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer array elements:");
        Integer[] intArray = new Integer[5];
        for (int i = 0; i < 5; i++) {
            intArray[i] = sc.nextInt();
        }
        System.out.println("Integer Array contains:");
        printArray(intArray);

        System.out.println("Enter double array elements:");
        Double[] doubleArray = new Double[5];
        for (int i = 0; i < 5; i++) {
            doubleArray[i] = sc.nextDouble();
        }
        System.out.println("Double Array contains:");
        printArray(doubleArray);
    }
}
    

