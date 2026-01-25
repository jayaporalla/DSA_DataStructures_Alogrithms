import java.util.Scanner;

public class checkForPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        sc.close();
    }

    private static boolean isPrime(int n){
        //naive approach
        // if(n == 1) return false;
        // for(int i = 2; i <= n; i++){
        //     if(n % i == 0){
        //         return false;
        //     }
        // }
        // return true

        //Some Efficient approach
        // if(n == 1) return false;
        // for(int i = 2; i * i <= n; i++){
        //     if(n % i == 0){
        //         return false;
        //     }
        // }
        // return true

        //Most very Efficient Approach
        if(n == 1) return false;
        if(n == 2 || n == 3){
            return true;
        }
        if(n % 2 == 0 || n % 3 == 0){
            return false;
        }
        for(int i = 5; i * i <= n; i = i + 6){
            if(n % i == 0 || n % (i + 2) == 0){
                return false;
            }
        }
        return true;
    }
}
