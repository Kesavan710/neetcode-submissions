class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start=weights[0];
        int end=weights[0];
        int mid;
        for(int i=1;i<weights.length;i++)
        {
            if(weights[i]>start)
                start=weights[i];
            end+=weights[i];
        }
        mid=start+(end-start)/2;
        
        while(start<=end)
        {
            int limit=0;
            int day=1;
            mid=start+(end-start)/2;
            for(int i=0;i<weights.length;i++)
            {
                 
                if((limit+weights[i])<=mid)
                    limit+=weights[i];
                else
                {
                    limit=weights[i];
                    day+=1;
                }           
            }
            if(day==days)
                end=mid-1;
            else if(day>days)
                start=mid+1;
            else
                end=mid-1;
        }
        return start;
    }
}