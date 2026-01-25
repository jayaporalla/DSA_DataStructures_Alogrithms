import java.util.Scanner;

public class LCMOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        // LCMOfTwoNumbers(a, b);
        System.out.println("LCM of " + a  + " and " + b + " is: " + lcm(a, b));
        sc.close();
    }

    // private static void LCMOfTwoNumbers(int a, int b){
    //     Naive Approach
    //     int mul = a * b;
    //     int max = Math.max(a, b);
    //     for(int i = max; i <= mul; i++){
    //         if(i % a == 0 && i % b == 0){
    //             System.out.println("LCM of a and b is: " + i);
    //             break;
    //         }
    //     }
    // }

    private static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    private static int lcm(int a, int b){
        return (a * b) / gcd(a, b);
    }
}
