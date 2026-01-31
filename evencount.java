public class evencount {
    public static void main(String[] args) {
        int[] arr = {82,892,3,2,3223,2};
        System.out.println(search(arr));
    }
    static int search(int[] arr){
        int count = 0;
        for(int num : arr){
            if(even(num)){
              count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberofdigits = digit(num);
        return numberofdigits % 2 == 0;
    }
    static int digit(int num){
        if (num == 0){
        return 1;
        }
        int count = 0 ;
        while(num>0){
            count ++;
            num = num/10;
        }
        return count ;
    }
            
        
    }
