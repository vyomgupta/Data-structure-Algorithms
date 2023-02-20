//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int s = 0;
        int e = n -1;
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(arr[mid] == x){
                int i = mid - 1;
                int j = mid + 1;
                int count = 1;
                while(i >= 0 && arr[i] == x){
                    count++; 
                    i--;
                }
                
                while(j < n && arr[j] == x){
                    count++; 
                    j++;
                }
                return count;
            }
            else if(arr[mid] < x){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return 0;
    }
}