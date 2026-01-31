public class minsearch {
    public static void main(String[] args) {
        int[] arr = {23,32,7,43,54,67,87,99,5};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for(int i = 1 ; i<arr.length;i++){
            if(arr[i] < ans ){
                ans = arr[i] ;
            }
        }
        return ans;
    }
}