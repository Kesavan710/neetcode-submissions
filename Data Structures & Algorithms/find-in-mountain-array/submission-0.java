/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start,mid,end;
        start=0;
        end=mountainArr.length()-1;
        mid=start+(end-start)/2;
        while(start<end){
            mid=start+(end-start)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1))
                end=mid;
            else
                start=mid+1;
        }
        int a=binary(0,start,mountainArr,target);
        
        if(a==-1)
            return revbinary(start,mountainArr.length()-1,mountainArr,target);
        return a;
    }
    int binary(int start,int end,MountainArray mountainArr,int target)
    {
        
        int mid=start+(end-start)/2;
        while(start<=end){
            mid=start+(end-start)/2;
            int a=mountainArr.get(mid);
            if(a==target)
                return mid;
            else if(a<target)
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }
    int revbinary(int start,int end,MountainArray mountainArr,int target)
    {
        int mid=start+(end-start)/2;
        while(start<=end){
            mid=start+(end-start)/2;
            int a =mountainArr.get(mid);
            if(a==target)
                return mid;
            else if(a<target)
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;
    }
}