import java.util.Arrays;
public class removeduplictes {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3,3,3,4};
        int k = removeDuplicates(nums);
System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, k)));

    }
    static int removeDuplicates(int[] nums) {
        int i = 0; // slow pointer

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {  // 
                i++;               // move slow pointer
                nums[i] = nums[j]; // copy unique value
            }
        }

        return i + 1; // number of unique elements
    }
}

