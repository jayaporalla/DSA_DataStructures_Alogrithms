public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90, 5};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        System.out.print("Quick Sort: ");
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
    public static void quickSort(int arr[], int low, int high){
        if(low < high){
            int pivot = parition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }
    public static int parition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j=low; j<high; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
}
