public class fiborecursion {
    public static void main(String[] args) {
        int ans = fibo(8);
        System.out.println(ans);
    }
    static int fibo(int n){
        if(n<2){ // base condition
            return n;
        }
        return fibo(n-1) + fibo(n-2); // recursion in which fibo calls own self fibo by different variable 

        
    }
}
// recursion how works and get break when break codition comes 
/*fibo(4)
= fibo(3) + fibo(2)

fibo(3)
= fibo(2) + fibo(1)

fibo(2)
= fibo(1) + fibo(0)

fibo(1) → base condition → returns 1
fibo(0) → base condition → returns 0*/
