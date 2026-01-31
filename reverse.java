import java.util.Arrays;

public class reverse {

    public static void main(String[] args) {
        int[] arr = {2,4,5,3,21};
        for(int i = 0 ; i < arr.length/2 ;i++){ // index i ko array ki adhi length tkk traverse krenge 
            int temp = arr[i]; // i = 0 ki value temp store karenge 
            arr[i] = arr[arr.length -1 -i]; // index 0 ko last wale se replace krr denge 
            arr[arr.length-1-i]= temp; // last wale ko samne se 
            // loop ab index 1 se shuru karenge phir same 
        }
        System.out.println("" + Arrays.toString(arr));
    }
}