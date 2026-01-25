import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        double[] unsortedArr = {3, 7, 6, -10, 15, 23.5, 55, -13};
        double[] sorted = mergeSort(unsortedArr);
        System.out.println("Merge Sort: ");
        for(double element : sorted){
            System.out.print(element + " ");
        }
    }
    public static double[] mergeSort(double[] sorted){
        if(sorted.length <= 1){
            return sorted;
        }
        int mid = sorted.length / 2;
        double[] left = Arrays.copyOfRange(sorted, 0, mid);
        double[] right = Arrays.copyOfRange(sorted, mid, sorted.length);
        double[] leftMerge = mergeSort(left);
        double[] rightMerge = mergeSort(right);
        double[] merge = merge(leftMerge, rightMerge);
        return merge;
    }
    public static double[] merge(double[] left, double[] right){
        double[] result = new double[left.length + right.length];
        int i=0, j=0, k=0;
        while( i<left.length && j<right.length){
            if(left[i] < right[j]){
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while(i<left.length){
            result[k++] = left[i++];
        }
        while(j<right.length){
            result[k++] = right[j++];
        }
        return result;
    }
}
