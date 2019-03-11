class Solution {
    public String addBoldTag(String s, String[] dict) {
        
        int n= s.length();
        int [] mark = new int [n+1];
        for(String d: dict){
            int i=-1;
            while((i=s.indexOf(d, i+1))>=0){
                mark[i]++;
                mark[i+d.length()]--;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        int sum=0;
        for(int i=0;i<=n;i++){
            int cur= sum+mark[i];
            if(sum==0 && cur >0)
                sb.append("<b>");
            if(cur==0 && sum>0)
                sb.append("</b>");
            if(i==n)
                break;
            sb.append(s.charAt(i));
            sum=cur;
        }
        
        return sb.toString();
        
    }
}