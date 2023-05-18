package Assingment_3;

public class Q_10 {
    public static String reverseString(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return reverseString(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String str = "pots&pans";
        String reversed = reverseString(str);
        System.out.println(reversed);
    }
}
