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
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");
        
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax1s(arr, n, m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int last0(int arr[], int m){
        
        int s = 0;
        int e = m - 1;
        int ans = -1;
        
        while(s <= e){
            int mid = (s + e) / 2;
            if(arr[mid] == 1){
                e = mid - 1;
            }
            else{
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }
    
    int rowWithMax1s(int arr[][], int n, int m) {
        int max = 0;
        int midx = -1;
        
        for(int i = 0 ;i < n ; i ++){
            int l0 = last0(arr[i], m);
            //System.out.println("last zero"+l0);
            if(l0 == -1){
                return i;
            }
            else{
                int cal = m - l0 - 1;
                if(cal > max){
                    max = cal;
                    midx = i;
                }
            }
            
            
        }
        return midx;
    }
}