public class Main {
    public static void main(String[] args) {

        //Implicit Conversion
        int num = 10;
        double d = num;
        System.out.println("Implicit conversion (int to double): " + d);

        //Explicit Conversion
        double doub = 45.874523;
        int val = (int) doub;
        System.out.println("Explicit conversion (double to int): " + val);
    }
}