import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched: ");
        int num = sc.nextInt();

        linearSearch(arr, num);
    }

    static void linearSearch(int[] arr, int num) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println("The element found at position " + i);
                return;
            }
        }

        System.out.println("The element is not present in the array");
    }
}