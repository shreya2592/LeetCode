public class MergeSort{

    public void sort(int arr[], int start, int end){
        if(start<end){

            //Find the middle point 
            int mid= (start+end)/2;
            sort(arr, start, mid);
            sort(arr, mid+1, end);
            merge(arr, start,mid, end);
        }
    }

    public void merge(int arr[], int start, int mid, int end){

        // Find sizes of two subarrays to be merged

        int n1= mid-start+1;
        int n2=end-mid;

        int[] left= new int[n1];
        int[] right=new int[n2];

        for(int i=0;i<n1;i++){
            left[i]=arr[start+i];
        }

        for(int i=0;i<n2;i++){
            right[i]=arr[mid+1+i];
        }


        //merge two temp arrays.

        int i=0, j=0;
        int k=start;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++;
            }

            else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }

        //copying the remaining elements of left[]

        while (i < n1) 
        { 
            arr[k] = left[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = right[j]; 
            j++; 
            k++; 
        } 
    }
    

    public static void main (String args[]){
        int arr[]={12,11,14, 5,6,8,1};
        System.out.print("Given Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
            
        System.out.println();

        MergeSort ob= new MergeSort();
        ob.sort(arr, 0, arr.length-1);

        System.out.print("\nSorted array"); 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}