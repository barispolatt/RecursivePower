import java.util.Scanner;

public class RecursivePower {

    static int recPow(int a, int b) {
        if (b == 0) {  // any number to power 0 is 1
            return 1;
        }
        return a * recPow(a, b - 1);  // a^b = a * a^(b-1)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int exp = sc.nextInt();

        System.out.println("Result: " + recPow(n, exp));

    }
}
