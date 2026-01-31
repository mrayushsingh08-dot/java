class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
    int peak = peakIndex(mountainArr);

    int firstTry = orderAgnosticBinarySearch(mountainArr, target, 0, peak);
    if (firstTry != -1) return firstTry;

    return orderAgnosticBinarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1);
}

int peakIndex(MountainArray mountainArr) {
    int start = 0;
    int end = mountainArr.length() - 1;

    while (start < end) {
        int mid = start + (end - start) / 2;

        if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
            end = mid;   // mid may be the peak
        } else {
            start = mid + 1;
        }
    }
    return start; // or end
}

int orderAgnosticBinarySearch(MountainArray arr, int target, int start, int end) {

    boolean isAscending = arr.get(start) < arr.get(end);

    while (start <= end) {
        int mid = start + (end - start) / 2;
        int value = arr.get(mid);

        if (value == target) return mid;

        if (isAscending) {
            if (target < value) end = mid - 1;
            else start = mid + 1;
        } else {
            if (target < value) start = mid + 1;
            else end = mid - 1;
        }
    }
    return -1;
}

    }
