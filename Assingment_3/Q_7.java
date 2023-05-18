package Assingment_3;
import java.util.Scanner;
public class Q_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter your choice:");
            System.out.println("1. Determine the factorial of a number");
            System.out.println("2. Determine XN for two numbers X, N");
            System.out.println("3. Determine GCD of two numbers");
            System.out.println("4. Binary equivalent of a decimal number");
            System.out.println("5. Product of two numbers");
            System.out.println("6. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    System.out.println("Factorial of " + num + " is " + factorial(num));
                    break;
                case 2:
                    System.out.print("Enter two numbers X and N: ");
                    int x = sc.nextInt();
                    int n = sc.nextInt();
                    System.out.println(x + "^" + n + " is " + power(x, n));
                    break;
                case 3:
                    System.out.print("Enter two numbers: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
                    break;
                case 4:
                    System.out.print("Enter a decimal number: ");
                    int dec = sc.nextInt();
                    System.out.println(dec + " in binary is " + decimalToBinary(dec));
                    break;
                case 5:
                    System.out.print("Enter two numbers: ");
                    int m = sc.nextInt();
                    int n1 = sc.nextInt();
                    System.out.println(m + "*" + n1 + " is " + product(m, n1));
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);
    }

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static String decimalToBinary(int dec) {
        if (dec == 0) {
            return "";
        }
        return decimalToBinary(dec / 2) + dec % 2;
    }

    public static int product(int m, int n) {
        if (n == 0) {
            return 0;
        }
        return m + product(m, n - 1);
    }
}

