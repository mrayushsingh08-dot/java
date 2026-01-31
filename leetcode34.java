public class leetcode34 {
    public static void main(String[] args) {
        int[] nums = {2,17,17,17,17,17,18,19,23,28,29};
        int target = 17;

        int[] ans = searchrange(nums, target);  
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] searchrange(int[] nums, int target) { 
        int[] ans = {-1, -1};

        int start = search(nums, target, true);
        int end   = search(nums, target, false);
 
        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    static int search(int[] nums, int target, boolean findstartindex) { 
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;  

                if (findstartindex) {
                    end = mid - 1;     
                } else {
                    start = mid + 1;  
                }
            }
        }

        return ans;
    }
}
