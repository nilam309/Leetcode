class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int n=arr.length;
        int i=0;
        while(i<n)
        {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            } else i++;
        }
        List<Integer> ans= new ArrayList<> ();
        for(int j=0;j<n;j++)
        {
            if(arr[j]!=j+1) ans.add(j+1);
        }

        return ans;
    }
    public void swap(int [] arr, int first, int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}