//TWO SUM//

/*class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}*/

//Median of Two Sorted Arrays

/*class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int i=0,j=0,k=0;
        int []merged=new int[n1+n2];
        while(i<n1 && j<n2)
        {
            if(nums1[i]<=nums2[j])
            {
                merged[k++]=nums1[i++];
            }
            else
            {
                merged[k++]=nums2[j++];
            }
        }
        while (i < n1) {
            merged[k++] = nums1[i++];
        }
        while (j < n2) {
            merged[k++] = nums2[j++];
        }

        int x=merged.length;
        double median;
        if(x%2!=0)
        {
             median=merged[x/2];
        }
        else
        {
            median = (merged[x / 2 - 1] + merged[x / 2]) / 2.0;
        }
        return median;
    }
}*/

