public class binaryrecursion {
    public static void main(String[] args) {
        int[] arr = {12,21,25,27,33,39,49,63,99,108,171};
        System.out.println(binary(arr, 108, 0, arr.length-1));
    }
    static int binary(int[] arr, int target ,int s , int e){
        if(s>e){
            return -1;
        }
        int m = s + (e-s)/2;
        if(arr[m] == target){
             return m;
        }
        if(arr[m]<target){
            return binary(arr, target, m+1, e);
        }else{
            return binary(arr, target, s, m-1);
        }
    }
}
