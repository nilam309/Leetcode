class Solution {
    public int maximumWealth(int[][] accounts) {
        int row=accounts.length;
        int col=accounts[0].length;
        int max=0;
        if(row==0) 
        {
            return max;
        }
       for(int [] i:accounts)
       {
        int sum=0;
        for(int j: i)
        {
            sum +=j;
        }
        max=Math.max(max,sum);
       }

        return max;
    }
}