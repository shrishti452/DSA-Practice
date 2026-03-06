// TWO SUM//

/*
 * class Solution {
 * public int[] twoSum(int[] nums, int target) {
 * int n=nums.length;
 * for(int i=0;i<n;i++)
 * {
 * for(int j=i+1;j<n;j++)
 * {
 * if(nums[i]+nums[j]==target)
 * {
 * return new int[]{i,j};
 * }
 * }
 * }
 * return new int[]{};
 * }
 * }
 */

// Median of Two Sorted Arrays

/*
 * class Solution {
 * public double findMedianSortedArrays(int[] nums1, int[] nums2) {
 * int n1=nums1.length;
 * int n2=nums2.length;
 * int i=0,j=0,k=0;
 * int []merged=new int[n1+n2];
 * while(i<n1 && j<n2)
 * {
 * if(nums1[i]<=nums2[j])
 * {
 * merged[k++]=nums1[i++];
 * }
 * else
 * {
 * merged[k++]=nums2[j++];
 * }
 * }
 * while (i < n1) {
 * merged[k++] = nums1[i++];
 * }
 * while (j < n2) {
 * merged[k++] = nums2[j++];
 * }
 * 
 * int x=merged.length;
 * double median;
 * if(x%2!=0)
 * {
 * median=merged[x/2];
 * }
 * else
 * {
 * median = (merged[x / 2 - 1] + merged[x / 2]) / 2.0;
 * }
 * return median;
 * }
 * }
 */

// Reverse Integer
/*
 * class Solution {
 * public int reverse(int x) {
 * int rev = 0;
 * 
 * while (x != 0) {
 * int rem = x % 10;
 * x = x / 10;
 * if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem
 * >7)) {
 * return 0;
 * }
 * if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && rem <
 * -8)) {
 * return 0;
 * }
 * 
 * rev = rev * 10 + rem;
 * }
 * 
 * return rev;
 * }
 * }
 */

//Remove Duplicates from Sorted Array

/*class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        int j = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }

        return j + 1;
    }
}
*/

// Remove Element

/*class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=val)
            {
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
} */
//Search in Rotated Sorted Array
/*class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int ind=-1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==target)
            {
               ind=i;
            }
        }
        return ind;
    }
} */

//FIND FIRAT AND LAST POSITION OF ELEMENT IN SORTED ARRAY
/*class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (first == -1) {
                    first = i;  
                }
                last = i;      
            }
        }
        return new int[]{first, last};
    }
}
 */
// Search Insert Position
/*class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] >= target) {
                return i;  
            }
        }

        return n;  
    }
}
 */
//Valid Sudoku
/*class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][]row=new boolean[9][9];
        boolean[][] col=new boolean[9][9];
        boolean[][]boxes=new boolean[9][9];

        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                if(board[r][c]=='.') continue;
                int num=board[r][c]-'1';
                int boxind=((r/3)*3) + c/3;

                if(row[r][num] || col[c][num] || boxes[boxind][num]){
                    return false;
                }
                row[r][num]=true;
                col[c][num]=true;
                boxes[boxind][num]=true;
            }
        }
        return true;
        
    }
} */
//Trapping Rain Water
/*class Solution {
    public int trap(int[] height) {
        int n=height.length;
int leftmax[]=new int[n];
int rightmax[]=new int[n];
leftmax[0]=height[0];
for(int i=1;i<n;i++)
{
    leftmax[i]=Math.max(height[i],leftmax[i-1]);
}
rightmax[n-1]=height[n-1];
for(int i=n-2;i>=0;i--)
{
    rightmax[i]=Math.max(height[i],rightmax[i+1]);
}
int water=0;
for(int i=0;i<n;i++)
{
    water+=Math.min(leftmax[i],rightmax[i])-height[i];
}
return water;

    }
} */
//Permutations
/*import java.util.*;

class Solution {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void backtrack(int[] arr, int index, List<List<Integer>> ans) {
        if (index == arr.length) {
            List<Integer> temp = new ArrayList<>();
            for (int num : arr) temp.add(num);
            ans.add(temp);
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            backtrack(arr, index + 1, ans);
            swap(arr, index, i);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, 0, ans);
        return ans;
    }
} */
//Permutations II

/*import java.util.*;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);   // Step 1: sort
        boolean[] used = new boolean[nums.length];
        backtrack(nums, used, new ArrayList<>(), result);
        return result;
    }
    
    private void backtrack(int[] nums, boolean[] used, 
                           List<Integer> current, 
                           List<List<Integer>> result) {
        
        if(current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        for(int i = 0; i < nums.length; i++) {
            
            // Skip if already used
            if(used[i]) continue;
            
            // Skip duplicates
            if(i > 0 && nums[i] == nums[i-1] && !used[i-1])
                continue;
            
            used[i] = true;
            current.add(nums[i]);
            
            backtrack(nums, used, current, result);
            
            // Backtrack
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}
 */
//Unique Paths II
/*class Solution {
    public int uniquePathsWithObstacles(int[][] oG) {
        if(oG[0][0]==1)return 0;
        oG[0][0]=1;
        int m=oG.length;
        int n=oG[0].length;
        for(int i=1;i<m;i++)
        {
            if (oG[i][0]==1)
            {
                oG[i][0]=0;
            }
            else
            {
                oG[i][0]=oG[i-1][0];
            }
        }
        for(int j=1;j<n;j++)
        {
            if(oG[0][j]==1)
            {
                oG[0][j]=0;
            }
            else
            {
                oG[0][j]=oG[0][j-1];
            }
        }
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(oG[i][j]==1)
                {
                    oG[i][j]=0;
                }
                else
                {
                    oG[i][j]=oG[i-1][j]+oG[i][j-1];
                }
            }
        }
        return oG[m-1][n-1];
     }
} */
//Sort Colors

/*class Solution 
{
public void sortColors(int[]nums)
{
    int n=nums.length;
        int low = 0, mid = 0, high = n - 1;
        while(mid <= high) 
        {
            if(nums[mid] == 0)
             {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid] == 1) 
            {
                mid++;
            }
            else
             { 
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
        for(int x : nums) 
        {
            System.out.print(x + " ");
        }
    }
} */
//Merge Sorted Array
/*class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int []merge=new int[m+n];
       for(int i=0;i<m;i++)
       {
        merge[i]=nums1[i];
       } 
       for(int i=0;i<n;i++)
       {
        merge[m+i]=nums2[i];
       }
       Arrays.sort(merge);
       for(int i=0;i<merge.length;i++)
       {
        nums1[i]=merge[i];
       }
    }
}

 */
//Best Time to Buy and Sell Stock
/*class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int buy=prices[0];
        int maxProfit=0;
        for(int i=0;i<n;i++)
        {
            if(prices[i]<buy)
            {
                buy=prices[i];
            }
            else
            {
                int profit=prices[i]-buy;
                maxProfit=Math.max(maxProfit,profit);   
            }
        }
        return maxProfit;
    }
} */
//Longest Consecutive Sequence
/*class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(nums[i]);
        }
        int longest=0;
        for(int num:set)
        {
            if(!set.contains(num-1))
            {
                int current_num=num;
                int count=1;
                while(set.contains(current_num+1))
                {
                    current_num++;
                    count++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
} */
//Single Number
/*class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;   // XOR cancels out duplicate numbers
        }
        return xor;
    }
}
 */
//Two Sum II - Input Array Is Sorted
/*class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        for(int i=0;i<n;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                if(numbers[i]+numbers[j]==target)
                {
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int []{};
    }
} */
//Majority Element
/*class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > n / 2) {
                return num;
            }
        }
        return -1;
    }
}
 */
//Contains Duplicate
/*class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashMap<Integer,Integer>map=new HashMap<>();
       for (int i=0;i<nums.length;i++)
       {
        if(map.containsKey(nums[i]))
        {
            return true;
        }
        else
        {
            map.put(nums[i],i);
        }

       } 
       return false;
    }
} */
//Contains Duplicate II
/*class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            {
                return true;
            }
            set.add(nums[i]);
            if(set.size()>k)
            {
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
} */
//Missing Number
/*class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int n=nums.length;
         int sum1=n*(n+1)/2;
        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];
        }
        return sum1-sum;
    }
} */
//Move Zeroes
/*class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(nums[i]);
        }
    }
} */
//Intersection of Two Arrays
/*class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] merge = new int[Math.min(n1, n2)];
        int k = 0;
        for (int i = 0; i < n1; i++) {
            boolean found = false;
            for (int j = 0; j < n2; j++) {
                if (nums1[i] == nums2[j]) {
                    found = true;
                    break;
                }
            }
            if (found) {
                boolean alreadyAdded = false;
                for (int x = 0; x < k; x++) {
                    if (merge[x] == nums1[i]) {
                        alreadyAdded = true;
                        break;
                    }
                }
                if (!alreadyAdded) {
                    merge[k++] = nums1[i];
                }
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = merge[i];
        }
        return result;
    }
}
 */
