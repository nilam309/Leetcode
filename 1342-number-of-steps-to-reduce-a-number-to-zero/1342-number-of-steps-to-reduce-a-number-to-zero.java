class Solution {
    public int numberOfSteps(int num) {
        return steps(num,0);
    }
    public int steps(int n,int count)
    {
        if(n==0)
        {
            return count;
        }
        count +=1;
        if((n%2==0))
        {
            n /=2;
        }
        else
        {
            n -=1;
        }
        return steps(n,count);
    }
}