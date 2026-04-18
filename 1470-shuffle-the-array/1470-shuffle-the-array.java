class Solution {
    public int[] shuffle(int[] nums, int n) {
        int numLen=nums.length;
        int [] temp=new int [numLen];
        int i=0; int j=n;
        for(int x=0; x<numLen;x++)
        {
            if(x%2==0)
            {
                temp[x]=nums[i];
                i++;
            }
            else
            {
                temp[x]=nums[j];
                j++;
            }
        }

        return temp;
    }
}