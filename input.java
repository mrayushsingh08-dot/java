import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 14;
        arr[3] = 21;
        arr[4] = 31;
        arr[5] = 18;
        System.out.println(arr[5]);
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = in.nextInt();
        }
        for(int i = 0 ; i < arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }
}
