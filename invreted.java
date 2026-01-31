import java.util.Scanner;
public class invreted {
    public static void main(String[] args) {
        int s = 5;
        for(int i = s;i>=1;i--){
            for(int j = 1;j<=s-i-1;j++){
                 System.out.println("");
            }
            System.out.print("*");
        }

    }
}
