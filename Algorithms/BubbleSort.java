public class BubbleSort{

    public void sort(int [] arr, int n){
        for(int i=1;i<n-1;i++){
            int flag=0;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }


            }

            if(flag==0)
            break;
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