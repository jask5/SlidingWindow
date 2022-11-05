import java.util.*;
import java.io.*;
import java.lang.*;

public class FindNegativeSW {
    static ArrayList<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int T = s1.nextInt(); //testcases
        while(T > 0) {
            int n = s1.nextInt(); //size of array
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = s1.nextInt();
            }
            list.clear();
            int k = s1.nextInt();
            firstNegative(arr, k, list);
            System.out.println();
            T--;

        }
    }
    public static void firstNegative(int[] arr, int k, ArrayList<Integer> list) {
        int i = 0, j =0;
        while(j < arr.length) {
            if(arr[j] < 0) {
                list.add(arr[j]);
            }
            if(j-i+1 < k) {
                j++;
            } else if(j-i+1 == k) {
                if(list.size() == 0) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(list.get(0) + " ");
                    if(arr[i] == list.get(0)) {
                        list.remove(0);
                    }
                }
                i++;
                j++; //maintaining window size
            }  
        }
    }
    
}
