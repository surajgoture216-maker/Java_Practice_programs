class tcsnqt
{
    public static void main(String args[])
    {
        int arr[]={2,4,0,2,4,6,0,1};
        int n=8;
        for(int i=0;i<n;i++)
        {    
            if(arr[i]==0)
            {
            for(int j=i+1;j<n;j++)
            {
             int temp=arr[j-1];
             arr[j-1]=arr[j];
             arr[j]=temp;
            }
        }
        }
                for(int k:arr)
                {
                    System.out.println(k);
                }

    }
}