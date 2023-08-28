import java.util.Arrays;
import java.util.Enumeration;
import java.util.Scanner;

public class PascalTriangle {
    public static int factorial(int number){
        int num = Math.abs(number);
        int dp[] = new int[num+1];
        dp[0] = 1;
        for(int i = 1;i<=num;i++){
            dp[i] = dp[i-1] * i;
        }
        return dp[num];
    }
    public static void draw(int size){
        //Spaces
        for(int i = 0;i<size;i++){
            for(int j=0;j<(size-i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(factorial(i)/(factorial(i-j)*factorial(j))+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sizeOfTheTriangle  = sc.nextInt();
        draw(sizeOfTheTriangle);
    }
}
