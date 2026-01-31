public class peakbinary {
    public static void main(String[] args) {
        int[] arr = {1, 2,3,4, 5,6, 17, 16, 14, 12,11};
        int ans = peakIndex(arr);
        System.out.println("Peak index = " + ans);
    }

    static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // If mid element is greater than next element, 
            // then you are in decreasing part of mountain.
            if (arr[mid] > arr[mid + 1]) {
                // peak is in left including mid
                end = mid;
            } else {
                // you are in increasing part, move right
                start = mid + 1;
            }
        }

        // start == end is the peak index
        return start;
    }
}

