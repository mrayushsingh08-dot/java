public class linearsearch {

    public static void main(String[] args) {
        int[] nums = {23,45,32,22,54,756,54,-33,99,-2};
        int target = -33;
        int ans = search(nums,target); 
        System.out.println(ans);
      }
      static int search(int[] arr, int target){
        if(arr.length == 0){ // if array have 0 elements than direct return -1;
            return-1;
        }
        for(int i = 0 ; i<arr.length;i++){
            int element = arr[i]; // element stores a index value 
            if(element==target){ //than compare with target if target matched than return index value
                return i;
            }
        }
        return -1; // if not matched target get return -1
      }
}