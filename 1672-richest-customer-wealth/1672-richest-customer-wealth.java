class Solution {
    public int maximumWealth(int[][] accounts) {
        int row=accounts.length;
        int col=accounts[0].length;
        int max=0;
        if(row==0) 
        {
            return max;
        }
        for(int i=0;i<row;i++)
        {
            int sum=0;
            for(int j=0;j<col;j++)
            {   
                sum +=accounts[i][j];
            }

            max= Math.max(max,sum);
            
        }

        return max;
    }
}