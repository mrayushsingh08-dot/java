import java.util.Arrays;

public class search2d {
    public static void main(String[] args) {
        int [][] arr ={
            {6,8,7,5},
            {67,87,90,54},
            {34,5,99,1}
        };
        int target = 87;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
    static int[] search(int[][] arr , int target){ // [][] it is for 2d array
        for (int row = 0; row<arr.length;row++){   //traverse at each row 
            for(int col = 0; col<arr[row].length;col++){ // now in each coloumn 
                if(arr[row][col] == target){ // index value compare with target vlue 
                    return new int[] {row,col}; // return row column and new for new reel
                }
            }
        }
            return new int[]{-1,-1};
        
    }
    static int max(int[][] arr){
        int max = 0;
        for(int[] nums : arr){ // firstly we go on each row 
            for(int elements : nums){ // then we traverse at each elements of row 
                if(elements>max){ // then our max is 0 it assign or compare with each elements because it is in loop
                    max = elements; // then assign a value 
                }
            }
        }
        return max;
    }
    
}
