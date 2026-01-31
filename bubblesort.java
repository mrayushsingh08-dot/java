import java.util.Arrays;
public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {2,1,3,6,9,8,7,4};
        bubble(arr);
       // System.out.print("Sorted Array: ");
       //for (int num : arr) {
          //   System.out.print(num + " ");
          //}
          System.out.println(Arrays.toString(arr));
        //This expects bubble(arr) to return an int[], but it returns void → error.
    }
    static void bubble(int[] arr){
          int n = arr.length;
          for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
          }
    }
    
}
