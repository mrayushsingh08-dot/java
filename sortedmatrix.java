import java.util.*;
public class sortedmatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11}
        };
        int target = 3;
        System.out.println(Arrays.toString(search(matrix, target)));
    }
      static int[] search(int[][] matrix , int target ){
        int m = matrix.length;
        int n= matrix[0].length;
        int start = 0;
        int end = m*n-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            int row = mid/n;
            int col = mid %n;
            if(matrix[row][col]==target){
                return new int[] {row,col};
            }
            if(matrix[row][col]<target){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return new int[]{-1,-1};
      }
    
}
