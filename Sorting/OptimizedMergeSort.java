import java.util.Arrays;

public class OptimizedMergeSort {
    public static void main(String[] args) {
        double[] unsortedArr = {3, 7, 6, -10, 15, 23.5, 55, -13};
        double[] result = mergeSort(unsortedArr);
        System.out.print("Optimized Merge Sort: ");
        for(double element : result){
            System.out.print(element + " ");
        }
    }
    public static double[] mergeSort(double[] unsortedArr){
        int step = 1;
        int n = unsortedArr.length;
        while(step < n){
            for(int i=0; i<n; i+=2*step){
            int mid = Math.min(i+step, n);
            int len = Math.min(i+2*step, n);
            double[] left = Arrays.copyOfRange(unsortedArr, i, mid);
            double[] right = Arrays.copyOfRange(unsortedArr, mid, len);
            double[] merge = merge(left, right);
            System.arraycopy(merge, 0, unsortedArr, i, merge.length);
            }
            step *= 2;
        }
        return unsortedArr;
    }
    public static double[] merge(double[] left, double[] right){
        double[] result = new double[left.length + right.length];
        int i=0, j=0, k=0;
        while(i<left.length && j<right.length){
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
