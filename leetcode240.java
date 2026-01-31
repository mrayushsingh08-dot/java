public class leetcode240 {
    public boolean search(int[][] matrix, int target) {

        // Case 1: 1D array (matrix with 1 row or 1 column)
        if (matrix.length == 1) {
            return binarySearch1D(matrix[0], target);
        }
        if (matrix[0].length == 1) {
            int[] col = new int[matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                col[i] = matrix[i][0];
            }
            return binarySearch1D(col, target);
        }

        // Case 2: 2D row-wise & column-wise sorted matrix → use staircase search
        return staircaseSearch2D(matrix, target);
    }

    // ---- 1D binary search ----
    boolean binarySearch1D(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return true;
            if (arr[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }

    // ---- 2D staircase search ----
    boolean staircaseSearch2D(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) return true;

            if (matrix[row][col] < target) row++;
            else col--;
        }
        return false;
    }
}


