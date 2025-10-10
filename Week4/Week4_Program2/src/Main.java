import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();

        System.out.println("The maximum of the three numbers is: " + findMax(a,b,c));
    }

    static int findMax(int a, int b, int c) {

        if(a>=b && a>=c)
            return a;
        else if(b>=a && b>=c)
            return b;
        else
            return c;
    }
}