class BinarySearch { 
    // Returns index of x if it is present in arr[l.. r], else return -1 
    int binarySearch(int arr[], int l, int r, int x) 
    {
        if (arr == null) {
            return -1;
        }

        int mid = (l + r) / 2 ;

        if (arr[mid] == x)
            return mid;
        else if (arr[mid] > x && mid != (arr.length-1) && mid != 0){
            return binarySearch(arr, l, mid -1 , x);
        } else if (arr[mid] < x && mid != 0 && mid != (arr.length-1)) {
            return binarySearch(arr, mid + 1, r , x);
        }

        return -1 ;
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 10; 
        int result = ob.binarySearch(arr, 0, n - 1, 0);
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
} 


/*
 Time complexity : O(logn)

 */
