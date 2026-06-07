class Solution {
    public int mySqrt(int x) {
        int start,end,mid;
        start=0;
        end=x/2;
        if(x==0 || x==1)
            return x;
        mid=start+(end-start)/2;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(mid==x/mid)
                return mid;
            else if(mid>x/mid)
                end=mid-1;
            else if(mid<x/mid)
                start=(mid+1);
        }
        mid=start+(end-start)/2;
        return end;

    }
}