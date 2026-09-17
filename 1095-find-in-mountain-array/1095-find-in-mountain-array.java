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
        int peak=peakInMountain(mountainArr);
        int firstHalf=orderAgnosticMountain(mountainArr,target,0,peak);
        int end=mountainArr.length() -1;
        if(firstHalf != -1) 
        {
            return firstHalf;
        }
        else 
        {return orderAgnosticMountain(mountainArr,target,peak + 1,end);}
    }
    static int peakInMountain(MountainArray arr)
    {
        int start=0;
        int end=arr.length()-1;

        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr.get(mid)<arr.get(mid+1))
            {
                start=mid+1;
            }
            else
            {
                end=mid;
            }
        }
        return start;
    }

    static int orderAgnosticMountain(MountainArray arr, int target, int start, int end)
    {
        boolean asc=arr.get(start)<arr.get(end);
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target==arr.get(mid)) return mid;
            if(asc)
            {
                if(target>arr.get(mid))
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }else
            {
                if(target<arr.get(mid))
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}