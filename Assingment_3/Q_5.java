/*Question-5: 
 
Write a java method using Generics to count the occurrence of an element in an array of any 
type. The signature of count method is given below. 
 
public static <T> int count(T[] array, T item)  
 
Sample run: 
 
Enter array elements 
1 
2 
3 
4 
5 
Enter the element to search 
4 
Number of times 4 present in the array is 1*/

package Assingment_3;

import java.util.*;

public class Q_5 {
    public static <T> int count(T[] array, T item) {
        int count = 0;
        for (T element : array) {
            if (element.equals(item)) {
                count++;
            }else{
                count = -1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arr = new Integer[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Integer n = 3;
        System.out.println(count(arr,3 ));
    }

}
