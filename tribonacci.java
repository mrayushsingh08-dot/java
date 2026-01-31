public class tribonacci {
    public static void main(String[] args) {
        int ans = tribonacci(4);
        System.out.println(ans);
    }
    static int tribonacci(int n) {
      
        if (n<2){
            return n;
        }
        if (n==2){
            return 1;
        }
        return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
    }
}
