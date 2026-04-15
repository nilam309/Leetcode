import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> maps=new HashMap <> (nums.length);

        for (int i=0;i<nums.length;i++)
        {
            int compute= target -nums[i];

            if(maps.containsKey(compute))
            {
                return new int []{maps.get(compute),i};
            }

            maps.put(nums[i],i);
        }

        return new int[0];
        
    }
}