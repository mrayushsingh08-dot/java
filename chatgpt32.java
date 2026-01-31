public class chatgpt32 {
    public int search(int[] nums, int target) {

        int pivot = findPivot(nums);

        // Case 1: Array not rotated
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // Case 2: The pivot is the target
        if (nums[pivot] == target) {
            return pivot;
        }

        // Case 3: Search in left sorted part
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        // Case 4: Search in right sorted part
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }


    // Correct binary search using passed start & end
    int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


    // Correct pivot finder
    int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Pivot condition:
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // Move left or right
            if (nums[mid] >= nums[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1; // No pivot → array not rotated
    }
}

