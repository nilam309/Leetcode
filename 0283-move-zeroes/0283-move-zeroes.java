class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length; //Brute Force

        int [] temp= new int [n];
        int j=0;
        for(int i=0;i<n;i++) //move all non-zero numbers to the temp array
        {
            if(nums[i]!=0)
            {
                temp[j]=nums[i];
                j++;
            }
        }
        for(int i=0;i<temp.length;i++) //put back all non-zeros to the original array
        {
            nums[i]=temp[i];
        }
       // for(int i=temp.length;i<n;i++) //set all remainng elemnets to 0
        //{
       //     nums[i]=0;
        //}
    }
}