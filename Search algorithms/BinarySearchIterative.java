public class BinarySearchIterative {
    int binarySearch(int arr[], int x){
        int l = 0, r = arr.length - 1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] < x)
                l = mid + 1;
            else
                r = mid - 1;
        }
        // Value not found
        return -1;
    }
    public static void main(String[] args){
        BinarySearchIterative ob = new BinarySearchIterative();
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 3;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element is not present in the array.");
        else
            System.out.println("Element Index is: " + result);
    }
}
