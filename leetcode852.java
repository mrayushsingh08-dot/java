public class leetcode852 {
  public static void main(String[] args){
   int[] arr = {0,10,5,2};
   System.out.println(binarysearching(arr, 0));
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
