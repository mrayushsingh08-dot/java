import java.util.*;
public class leetcode740 {

    public static void main(String[] args) {
        int[][] arr = {
            {12,21,23,24}
        };
        System.out.println(Arrays.toString(search(arr, 21)));
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

