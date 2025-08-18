import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println(countDigit(n));
        sc.close();
    }

    public static int countDigit(int n){
        int count = 0;
        while(n > 0){
            count++;
            n = n / 10;
        }
        return count;
    }
}