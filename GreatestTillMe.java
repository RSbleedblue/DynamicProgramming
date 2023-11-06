import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        } 
        greatestTillMe(arr,size);
    }
    public static void greatestTillMe(int arr[],int size){
        int prefix[] = new int[size];
        prefix[0] = arr[0];
        for(int i = 1; i < size; i++){
            prefix[i] = Math.max(arr[i],prefix[i-1]);
        }
        for(int i = 0;i < size; i++){
            System.out.println(prefix[i]);
        }
    }
}
