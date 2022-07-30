class SelectionSort{
    void sort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            int min = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min])
                    min = j;
            //Swap two element
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    // Helper method to print Array.
    void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args){
        int arr[] = {75, 99, 23, 6, 1, 100};
        SelectionSort ob = new SelectionSort();
        ob.sort(arr);
        System.out.println("Sorted array is: ");
        ob.printArray(arr);
    }
}
