class LinearSearch {
    public static void main(String[] args) {
        int myArray[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 8;
        int result = linearSearch(myArray, target); 
        if(result != -1){
            System.out.println(target + " found at index " + result);
        } else {
            System.out.println(target + " not found in array so index is -1");
        }
    }
    // have habit of writing in methods because we can call them whenever we want good developers do this.
    public static int linearSearch(int myArray[], int target){
        for(int i=0; i<myArray.length; i++){
            if(myArray[i] == target){
                return i;
            }
        }
        return -1;
    }
}