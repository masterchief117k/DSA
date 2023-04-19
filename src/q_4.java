/*Question-4: 
 
Write a Java program that outputs all possible strings formed by using the characters 'c', 'a', 'r', 
'b', 'o', and 'n' exactly once
 */
public class q_4 {
    public static void generateStrings(String remainingChars, String currentString) {
        // Base case: if there are no remaining characters, print the current string
        if (remainingChars.length() == 0) {
            System.out.println(currentString);
        } else {
            // For each remaining character, add it to the current string and generate all possible strings with the remaining characters
            for (int i = 0; i < remainingChars.length(); i++) {
                char c = remainingChars.charAt(i);
                String newRemainingChars = remainingChars.substring(0, i) + remainingChars.substring(i+1);
                generateStrings(newRemainingChars, currentString + c);
            }
        }
    }
    public static void main(String[] args) {
        String characters = "carbon";
        generateStrings(characters, "");
    }
    
}