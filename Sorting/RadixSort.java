import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int array[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
        System.out.print("Input: ");
        System.out.println(Arrays.toString(array));
        radixSort(array);
        System.out.print("Radix Output: " + Arrays.toString(array));
    }
    private static void radixSort(int array[]){
        int[][] radixArray = new int[10][array.length];
        int[] count = new int[10];
        int maxValue = max(array);
        int exp = 1;
        while(maxValue / exp > 0){
            for(int element : array){
                int index = (element / exp) % 10;
                radixArray[index][count[index]++] = element;
            }
            int pos = 0;
            for(int i = 0; i < 10; i++){
                for(int j = 0; j < count[i]; j++){
                    array[pos] = radixArray[i][j];
                    pos++;
                }
                count[i] = 0;
            }
            exp *= 10;
        }
    }
    private static int max(int array[]){
        int max = array[0];
        for(int element : array){
            if(element > max){
                max = element;
            }
        }
        return max;
    }
}
