public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,9,11,43,54,99};
        int target = 54;
        int binarysearching = 0;
        System.out.println(binarysearching(arr, target));
    }
    static int binarysearching(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
               end = mid - 1;
            }else if(target>arr[mid]){
            start = mid + 1;
            }else{
                return mid;
            }
        }
        return-1;
    }
}
