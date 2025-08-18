import java.util.Scanner;

public class HCFOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println(HCFOfTwoNumbers(a, b));
        sc.close();
    }

    private static int HCFOfTwoNumbers(int a, int b){
        // int result = 0;
        // int min = Math.min(a, b);
        // for(int i = 1; i <= min; i++){
        //     if(a % i == 0 & b % i == 0){
        //         result = i;
        //     }
        // }
        // return result;

        //Euclidean Algorithm - method 1
        // while( a != b){
        //     if(a > b){
        //         a = a - b;
        //     } else {
        //         b = b - a;
        //     }
        // }
        // return a;

        //Euclidean Algorithm - method 2
        if(b == 0) return a;
        return HCFOfTwoNumbers(b, a % b);
    }
}
