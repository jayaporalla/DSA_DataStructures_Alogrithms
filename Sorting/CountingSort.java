public class CountingSort {
    public static void main(String[] args) {
        int arr[] = {4, 2, 2, 6, 3, 3, 1, 6, 5, 2, 3};
        countingSort(arr);
        System.out.print("Counting Sort: ");
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
    public static void countingSort(int[] arr){
        int maxValue = arr[0];
        for(int element : arr){
            if(element > maxValue){
                maxValue = element;
            }
        }
        int[] count = new int[maxValue + 1];
        for(int element : arr){
            count[element]++;
        }
        int index = 0;
        for(int i=0; i<=maxValue; i++){
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }
}
