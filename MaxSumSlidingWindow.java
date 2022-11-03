import java.io.*;
import java.util.*;


class maxCalculate {
    public static long findMaxSubArray(int k, int[] arr, int n) {
        if(n <k) {
            return -1;
        }
        int i = 0, j =0;
        long sum = 0, max_sum = Integer.MIN_VALUE;
        while(j < n){
            sum += arr[j];
            if(j-i+1 < k) {
                j++;
            } else if(j-i+1 == k) {
                max_sum = Math.max(sum, max_sum);
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        return max_sum;

    }
} 

public class MaxSumSlidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeWindow = sc.nextInt();
        int[] arr = {2, 5, 1, 8, 2, 9, 1};
        int n = arr.length;
        maxCalculate max = new maxCalculate();
        System.out.println(max.findMaxSubArray(sizeWindow, arr, n));

    }
    
}
