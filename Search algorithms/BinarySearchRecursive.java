class BinarySearchRecursive {
    int binarySearch(int arr[], int l, int r, int x){
        if(l <= r){
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        // Value not found
        return -1;
    }

    public static void main(String[] args){
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;
        BinarySearchRecursive ob = new BinarySearchRecursive();
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if(result == -1)
            System.out.println("Element is not present in the array.");
        else
            System.out.println("Element Index is: " + result);

    }
}
