public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90, 5};
        /**
         * Insertion sort have only one way i.e., normal and optimized have only one solution
         */
        int n = arr.length;
        for(int i=1; i<n; i++){
            int Index = i;
            int value = arr[Index];
            int j = i - 1;
            while(j >= 0 && arr[j] > value){
                arr[j + 1] = arr[j];
                Index = j;
                j--; 
            }
            arr[Index] = value;
        }
        System.out.print("Insertion Sort: ");
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
}
