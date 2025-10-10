public class Main {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("The original array is: ");
        for(int a: arr)
            System.out.print(a + " ");

        int[] reversed = reverseArray(arr);
        System.out.println("\nThe reversed array is: ");
        for(int a: reversed)
            System.out.print(a + " ");
    }

    static int[] reverseArray(int[] arr) {

        int i=0, j=arr.length-1;
        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        return arr;
    }
}