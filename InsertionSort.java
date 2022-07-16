public class InsertionSort {
    void sort(int arr[]){                  // Post-Increment(i++)
        int n = arr.length;                // Pre-Increment(++i)
        for (int j = 1; j < n; ++j){
            int key = arr[j];
            int i = j -1;

            while (i >= 0 && arr[i] > key){
                arr[i + 1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = key;
        }
    }
    static void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    // Driver code
    public static void main(String[] args){
        int arr[] = {12, 11, 13, 5, 6};
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        printArray(arr);
    }
}
