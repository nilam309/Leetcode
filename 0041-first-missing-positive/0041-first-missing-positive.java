class Solution {
    public int firstMissingPositive(int[] arr) {
      int n=arr.length;
      int i=0;
      while(i<n)
      {
        int correct=arr[i]-1;
        if(arr[i]>0 && arr[i]<=n && arr[i]!=arr[correct])
        {
            swap(arr,i,correct);
        }
        else
        {
            i++;
        }
      }
      for(int j=0;j<n;j++)
      {
        if(arr[j]!=j+1)
        {
            return j+1;
        }
      }
      return n+1;
    }
    public void swap(int[] arr, int first, int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}