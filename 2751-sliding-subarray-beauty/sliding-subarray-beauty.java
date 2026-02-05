class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n=nums.length;
        int res[]=new int[n-k+1];
        int negcount=0;
       int fre[]=new int[51];
        // first window
        for(int i=0;i<k;i++)
        {
            if(nums[i]<0)
            {
                negcount++;
                fre[-nums[i]]++;  
            }
        }       
        for(int i=k;i<=n;i++)
        {
            res[i-k]=getX(fre,x);
            if(i==n)
            {
                break;
            }
            int val=nums[i-k];
            if(val<0)
            {
                fre[-val]--;

            }
            int newval=nums[i];
            if(newval<0)
            {
                fre[-newval]++;

            }
        }
        return res; 
    }
    public int getX(int arr[],int x)
    {
        int c=arr.length-1;
        while(c>=1)
        {
            x-=arr[c];
            if(x<=0)
            {
                return -c;
            }
            c--;
        }
        return 0;
    }
}