public class QuickSort{


    public int partition(int [] A, int start, int end){
        int pivot=A[end];
        int pIndex=(start-1);

        for (int i=start;i<end;i++){
            if(A[i]<=pivot){
                pIndex++;
                int temp= A[pIndex];
                A[pIndex]=A[i];
                A[i]=temp;
                
            }
        }
        
        int temp = A[pIndex+1];
        A[pIndex+1]=A[end];
        A[end]=temp;
        return pIndex+1;
    }


    public void sort(int[] A, int start, int end){
        if(start<end){
            int pIndex=partition(A, start,end);
            sort(A,start, pIndex-1);
            sort(A,pIndex+1,end);
        }

    }



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
        int arr[] = {10, 7, 8, 9, 1, 5}; 
        int n = arr.length; 
  
        QuickSort ob = new QuickSort(); 
        ob.sort(arr, 0, n-1); 
  
        System.out.println("sorted array"); 
        printArray(arr); 
    } 


    
}