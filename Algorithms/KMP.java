public class KMP{




    private int[] computeTemporaryArray(char pattern[]){

        int[] arr = new int[pattern.length];
        int j=0;

        for (int i=1;i<pattern.length;){
            if(pattern[i]==pattern[j]){
                arr[i]= j+1;
                j++;
                i++;
            }

            else{
                if(j!=0){
                    j=arr[j-1];
                }

                else{
                    arr[i]=0;
                    i++;
                }
            }
        }

        return arr;


    }

    public boolean KMPAlgo(char[] text, char[] pattern){
        int arr[]=computeTemporaryArray(pattern);
        int i=0;
        int j=0;
        while(i< text.length && j< pattern.length){
            if(text[i]==pattern[j]){
                i++;
                j++;
            }

            else{
                if(j!=0){
                    j=arr[j-1];

                }
                else
                    i++;
            }
        }

        if(j==pattern.length)
        return true;

    return false;


    }




    public static void main(String args[]){
        
        String str = "abcxabcdabcdabcy";
        String subString = "abcdabcy";
        KMP ss = new KMP();
        boolean result = ss.KMPAlgo(str.toCharArray(), subString.toCharArray());
        System.out.print(result);
        
    }

    
}