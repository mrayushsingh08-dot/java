public class maxsearch {
    public static void main(String[] args) {
        int[] arr = {45,76,98,99,4,65,3,-7,54};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int ans = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]>ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
