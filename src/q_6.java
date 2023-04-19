import java.util.*;

public class q_6 {
    public static int sum_of_Digits(int n) {
        int sum = 0;
        while (n > 0) {
            int a = n % 10;
            n /= 10;
            if (a <= 5) {
                sum += a;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the digits");
        int n = sc.nextInt();
        System.out.println(sum_of_Digits(n));
        sc.close();
    }
}
