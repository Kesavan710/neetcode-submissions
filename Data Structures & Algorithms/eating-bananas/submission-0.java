class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int end=piles[0];
        for(int i=1;i<piles.length;i++)
        {
            if(piles[i]>end)
                end=piles[i];
        }
        int start=1;
        int mid=start+(end-start)/2;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            long k=0;
            for(int i=0;i<piles.length;i++)
            {
                k=k+(int)Math.ceil((double)piles[i]/mid);
            }
            if(k>h)
                start=mid+1;
            else
                end=mid-1;

        }
        return start;

    }
}
