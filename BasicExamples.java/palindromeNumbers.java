import java.util.Scanner;

public class palindromeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));;
        sc.close();
    }

    private static boolean isPalindrome(int n){
        int reverse = 0;
        int temp = n;
        while(temp != 0){
            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp = temp / 10;
        }
        return (n == reverse);
    }
}
