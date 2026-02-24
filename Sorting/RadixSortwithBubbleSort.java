// The below logic is radixSort with bubbleSort. Normal radixSort is okay but using bubbleSort makes logic more complex
// adding or using un-neccessary logic. better not to use it.

import java.util.Arrays;

public class RadixSortwithBubbleSort {
    public static void main(String[] args) {
        int array[] = {170, 45, 75, 90, 802, 24, 2, 66};
        System.out.println("Input: " + Arrays.toString(array));
        radixSort(array);
        System.out.println("Radix Output: " + Arrays.toString(array));
    }
    private static void radixSort(int array[]){
        int max = array[0];
        for(int element : array) {
            if(element > max){
                max = element;
            }
        }

        int[][] radixArray = new int[10][array.length];
        int[] count = new int[10];
        int exp = 1;

        while(max / exp > 0){
            for(int element : array){
                int index = (element / exp) % 10;
                radixArray[index][count[index]++] = element;
            }

            for(int i = 0; i < 10; i++){
                int[] tempArray = new int[count[i]];
                System.arraycopy(radixArray[i], 0, tempArray, 0, count[i]);
                bubbleSort(tempArray);
                System.arraycopy(tempArray, 0, radixArray[i], 0, count[i]);
            }

            int pos = 0;
            for(int i = 0; i < 10; i++){
                for(int j = 0; j < count[i]; j++){
                    array[pos++] = radixArray[i][j];
                }
                count[i] = 0;
            }
            exp *= 10;
        }
    }
    private static void bubbleSort(int array[]){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
