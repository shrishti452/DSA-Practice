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