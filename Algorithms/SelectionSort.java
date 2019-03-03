public class SelectionSort{

    public void sort(int[] arr, int n){

        for(int i=0;i<n-2;i++){
            int iMin=i;

            for(int j=i+1;j<n-1;j++){
                if(arr[j]<arr[iMin]){
                    iMin=j;
                }

            }

            int temp= arr[i];
            arr[i]=arr[iMin];
            arr[iMin]=temp;


        }



    }

    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
  
    
    public static void main(String args[]) 
    {         
        int arr[] = {12, 11, 13, 5, 6}; 
        int size=arr.length;
  
        InsertionSort ob = new InsertionSort();         
        ob.sort(arr,size); 
          
        printArray(arr); 
    } 


}
