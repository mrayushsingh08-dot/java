import java.util.Arrays;
public class insertionsort {

    public static void main(String[] args) {
        int[] arr = {7,4,1,3,2,8,6,9,5};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        int n=arr.length;
        for(int i = 1; i<n;i++){
            int j = i-1;
            int key = arr[i];
            while(j>=0 && arr[j] > key){
                arr[i] = arr[j];
                j--;
            }
              arr[j + 1] = key;
        }
    }
}