/*Question-7: 
Write a java program to find the maximum and minimum and how many times they both occur 
in  an  array  of  n  elements.  Find  out  the  positions  where  the  maximum  first  occurs  and  the 
minimum last occurs. 
 
Sample Run: 
Enter number of elements of Array: 5 
Enter elements of the array: 12 14 12 14 13 
Maximum element of Array is 14 and occurs 2 times. 
Minimum element of Array is 12 and occurs 2 times. 
First occurrence of maximum element is at position 2. 
Last occurrence of minimum element is at position 3.
 */

 import java.util.Scanner;

 public class q_7{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter number of elements of Array: ");
         int n = sc.nextInt();
         int[] arr = new int[n];
         System.out.print("Enter elements of the array: ");
         for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
         }
         int max = arr[0];
         int min = arr[0];
         int maxCount = 1;
         int minCount = 1;
         int firstMaxIndex = 0;
         int lastMinIndex = 0;
         for (int i = 1; i < n; i++) {
             if (arr[i] > max) {
                 max = arr[i];
                 maxCount = 1;
                 firstMaxIndex = i;
             } else if (arr[i] == max) {
                 maxCount++;
             }
             if (arr[i] < min) {
                 min = arr[i];
                 minCount = 1;
                 lastMinIndex = i;
             } else if (arr[i] == min) {
                 minCount++;
                 lastMinIndex = i;
             }
         }
         System.out.println("Maximum element of Array is " + max + " and occurs " + maxCount + " times.");
         System.out.println("Minimum element of Array is " + min + " and occurs " + minCount + " times.");
         System.out.println("First occurrence of maximum element is at position " + (firstMaxIndex + 1) + ".");
         System.out.println("Last occurrence of minimum element is at position " + (lastMinIndex + 1) + ".");
     }
 }
