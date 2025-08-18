import java.util.Scanner;

public class trailingZeroInFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Trailing Zeros in the given number is: ");
        System.out.print(trailingZeros(n));
        sc.close();
    }

    private static int trailingZeros(int n){
        int count = 0;
        for(int i = 5; i <= n; i = i * 5){
            count += n / i;
        }
        return count;
    }
}
