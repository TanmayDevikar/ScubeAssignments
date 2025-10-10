import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("Given number is NOT a prime number");
            return;
        }

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                System.out.println("Given number is NOT a prime number");
                return;
            }
        }

        System.out.println("Given number is a prime number");
    }
}