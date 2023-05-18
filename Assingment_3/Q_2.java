/*Question-2: 
 
Assign your favourite colours in an array. Identify 2 exceptions that may be generated & write 
exceptional handler in Java. Also, display the four colours after handling any 2 exceptions. 
 
Sample run: 
Enter four colours 
RED 
BLUE 
YELLOW 
GREEN 
Convert string to integer 
java.lang.NumberFormatException: For input string: "RED" 
Enter one more colour 
VIOLET 
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of 
bounds for length 4 
The colours entered are 
RED 
BLUE 
YELLOW
 */
 package Assingment_3;
import java.util.*;

public class Q_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] colors = new String[4];
        System.out.println("Enter four colors:");
        for (int i = 0; i < 4; i++) {
            try {
                colors[i] = sc.nextLine().toUpperCase();
                if (colors[i].equals("")) {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. Please enter a color.");
                i--;
            } catch (Exception e) {
                System.out.println("An error occurred. Please try again.");
                i--;
            }
        }
        System.out.println("Your favorite colors are:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
