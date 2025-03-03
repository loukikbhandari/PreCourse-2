class QuickSort 
{ 
    /* This function takes last element as pivot, 
       places the pivot element at its correct 
       position in sorted array, and places all 
       smaller (smaller than pivot) to left of 
       pivot and all greater elements to right 
       of pivot */
    void swap(int arr[],int i,int j){

        arr[i] = arr[i] + arr[j];
        arr[j] =  arr[i]-arr[j];
        arr[i]  = arr[i] - arr[j];

    }
    
    int partition(int arr[], int low, int high) 
    { 
   	//Write code here for Partition and Swap

        int i = low - 1;

        for (int k = low;  k < high ; k++) {

            if (arr[k] < arr[high]) {
                i++;
                swap(arr, i , k);
            }

        }

//        System.out.println("Printing new array " +  low + " high " +  high);
//        printArray(arr);

        i = i + 1;
        swap(arr, i , high);

        return i;

    } 
    /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
    void sort(int arr[], int low, int high) 
    {  
            // Recursively sort elements before 
            // partition and after partition

        if (low < high) {


            int mid = partition(arr, low , high);

            System.out.println(mid);
           // printArray(arr);

            sort(arr, low, mid-1);
            sort(arr, mid+1, high);

        }




    } 
  
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    // Driver program 
    public static void main(String args[]) 
    { 
        int arr[] = {10, 7, 8, 8, 1, 5};
        int n = arr.length; 
  
        QuickSort ob = new QuickSort(); 
        ob.sort(arr, 0, n-1); 
  
        System.out.println("sorted array"); 
        printArray(arr); 
    } 
} 


/*

Time complexity : O (nlogn)

Space complexity : O (1) constant


 */
