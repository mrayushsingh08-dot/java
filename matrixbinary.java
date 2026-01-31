import java.util.Arrays;

public class matrixbinary {
    public static void main(String[] args) {
        int[][] arr = {
            {12,21,23,24},
            {17,25,28,30},
            {25,30,35,40}
        };
        System.out.println(Arrays.toString(search(arr, 28)));
    }
    static int[] search(int[][] matrix,int target){
        int row = 0;
        int column = matrix.length -1;
        while(row<matrix.length && column>=0){
            if(matrix[row][column] == target){
                return new int[]{row, column};
            }
            if(matrix[row][column]<target){
                row++;
            }else{
                column--;
            }
        }
        return new int[]{-1,-1};

    }
}
