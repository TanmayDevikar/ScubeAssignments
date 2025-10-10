import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Choose the number of operation: \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        int op = sc.nextInt();

        double result = 0;
        switch (op) {
            case 1:
                result = a + b;
                break;

            case 2:
                result = a - b;
                break;

            case 3:
                result = a * b;
                break;

            case 4:
                result = (double) a / b;
                break;

            default:
                System.out.println("Invalid operation");
                return;
        }

        System.out.println("The result is: " + result);
    }
}