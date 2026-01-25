public class OptimizedSelectionSort {
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90, 5};
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int minIndex = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.print("Optimized Selection Sort: ");
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
}
