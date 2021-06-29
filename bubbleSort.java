// bubble sort algorithm for sorting elements of an array

class BubbleSort {
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            boolean swap = false;
            int j = 0;
            while(j < n-i-1){
                if(arr[j] > arr[j+1]){
                    swap = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                j++;
            }
            if(!swap) {
                break;
            }
        }
        for (int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,2,5,9,11,129,67,22,378};
        bubbleSort(arr);
    }
}
