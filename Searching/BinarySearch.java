public class BinarySearch {
    public static void main(String[] args) {
        int myArray[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 11;
        int result = binarySearch(myArray, target);
        if(result != -1){
            System.out.println(target + " found at index " + result);
        } else {
            System.out.println(target + " not found in array so index is -1");
        }
    }
    public static int binarySearch(int myArray[], int target){
        int left = 0, right = myArray.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(myArray[mid] == target){
                return mid;
            } else if(myArray[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
