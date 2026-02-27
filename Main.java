import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int array[] = {2, 6, 8, 3, 5, 4, 1};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
    private static void quickSort(int array[], int left, int right){
        if(left < right){
            int index = parition(array, left, right);
            quickSort(array, left, index + 1);
            quickSort(array, index - 1, right);
        }
    }
    private static int parition(int array[], int left, int right){
        // int end = array[right];
        int start = left - 1;
        int temp = array[start + 1];
        array[start + 1] = array[right];
        array[right] = temp;
        return start + 1;
    }
}
