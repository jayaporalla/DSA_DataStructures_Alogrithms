import java.util.Scanner;

public class factorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Factorial of " + n + " is: ");
        System.out.print(factorial(n));
        sc.close();
    }

    // Recursive takes more aux space compared to iterative so prefer doing with iterative.
    // private static int factorial(int n){
    //     if(n == 0) return 1;
    //     return n * factorial(n - 1);
    // }

    private static int factorial(int n){
        int result = 1;
        for(int i = n; i >= 1; i--){
            result = result * i;
        }
        return result;
    }
}
