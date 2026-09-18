class Solution {
    public int splitArray(int[] arr, int m) {
        int start=0;
        int end=0;
        //let's first set the start and end
        for(int i=0;i<arr.length;i++)
        {
            start=Math.max(start,arr[i]); //start/min value will be the largetst element in the 
            // array
            end=end+arr[i]; // max/end value will be the sum of all the elements in the array.
        }
        while(start<end)
        {
            int mid=start+(end-start)/2;
            //lets calculate the count of pieces we can make with the given mid as a sum of the 
            // array
            int sum=0;
            int pieces=1;
            for(int num:arr)
            {
                if(sum + num>mid)
                {
                    pieces++;
                    sum=num;
                }
                else {
                    sum+=num;
                }
            }
            if(pieces<=m)
            {
                end=mid;
            }
            else {
                start=mid+1;
            }
        }
        return start; //start and end is equal at this stage.
    
    }
}