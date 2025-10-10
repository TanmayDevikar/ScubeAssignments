import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principle Amount: ");
        double P = sc.nextDouble();

        System.out.println("Enter Time (in years): ");
        double T = sc.nextDouble();

        System.out.println("Enter Rate of Interest: ");
        double R = sc.nextDouble();

        double SI = (P*T*R) / 100;
        System.out.println("Simple Interest = " + SI);

        sc.close();
    }
}