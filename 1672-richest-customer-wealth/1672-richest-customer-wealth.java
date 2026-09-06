class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwealth=0;
        for(int[] i:accounts) {
            int wealth = 0;
            for (int j : i) {
                wealth += j;
            }
            maxwealth=Math.max(wealth,maxwealth);
        }
        return maxwealth;
    }
}