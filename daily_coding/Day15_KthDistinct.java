package daily_coding;
public class Day15_KthDistinct {
    public static void main(String ar[])
    {
        int arr[]={1,2,2,3,3,34,5};
        int k=3,index=0;
       for(int i=0;i<arr.length;i++){
           if(i==0){
                if(arr[i]==arr[i+1])
                   continue;
                else{
                   k--;
                   continue;}
             }
           if(i==arr.length-1){
                if(arr[i]==arr[i-1])
                  continue;
                else{
                   k--;
                   if(k==0){
                     index=i;
                      break;}
                   continue;}
             }
            if(arr[i]==arr[i+1]||arr[i]==arr[i-1])
                continue;
            else
                 k--;
            if(k==0){
                index=i;
                break; }
            }
            System.out.println("elment is:"+arr[index]);
         }
       }
    
    

