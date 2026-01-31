import java.util.Arrays;
public class selectionort {
    public static void main(String[] args) {
        int[] arr = {5,7,2,4,9,1,8,3,6};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int i = 0; i<arr.length;i++){
            int smallestindex = i;
            for(int j = i + 1; j< arr.length;j++){
                if(arr[j] < arr[smallestindex]){
                    smallestindex = j;
                }
            }
            int temp = arr[smallestindex];
            arr[smallestindex] = arr[i];
            arr[i] = temp;
        }
    }
}
