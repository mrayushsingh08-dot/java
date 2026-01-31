public class binay {

    public static void main(String[] args) {
        int[] arr = {12,32,3,434,65,64,9,98,36,99};
        int target = 32;
        int ans = binaryseach(arr, target);
        System.out.println(ans); 
        
    }
    static int binaryseach(int[] arr ,int target ){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
        if(target < arr[mid]){
            end = mid -1;
        }else if(target>arr[mid]){
            start = mid + 1;
        }else {
            return mid;
        }
    }
        return -1;
    }
}