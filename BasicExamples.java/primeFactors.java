import java.util.Scanner;

public class primeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        primeFactor(n);
        sc.close();
    }

    // private static boolean isPrime(int n){
    //     if(n == 1) return false;
    //     if(n == 2 || n == 3){
    //         return true;
    //     }
    //     if(n % 2 == 0 || n % 3 == 0){
    //         return false;
    //     }
    //     for(int i = 5; i * i <= n; i = i + 6){
    //         if(n % i == 0 || n % (i + 2) == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    public static void primeFactor(int n){
        // naive approach
        // for(int i = 2; i <= n; i++){
        //     if(isPrime(i)){
        //         int x = i;
        //         while(n % x == 0){
        //             System.out.print(i + " ");
        //             x = x * i;
        //         }
        //     }
        // }

        //Some Efficient approach
        if(n <= 1) return;
        for(int i = 2; i * i <= n; i++){
            while(n % i == 0){
                System.out.print(i + " ");
                n = n / i;
            }
        }
        if(n > 1){
            System.out.print(n);;
        }

        //Most very Efficient Approach
        // if(n == 1) return n;
        // if(n == 2 || n == 3){
        //     return n;
        // }
        // else if(n % 2 == 0){
        //     n = n / 2;
        //     return 2;
        // }
        // else if(n % 3 == 0){
        //     n = n / 3;
        //     return 3;
        // } else {
        //     for(int i = 5; i * i <= n; i = i + 6){
        //         if(n % i == 0 || n % (i + 2) == 0){
        //             return i;
        //         }
        //     }
        // }
        // return n;
    }
}
