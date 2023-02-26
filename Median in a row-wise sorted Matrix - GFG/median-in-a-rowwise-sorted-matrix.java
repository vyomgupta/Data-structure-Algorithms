//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S[] = read.readLine().split(" ");
            int R = Integer.parseInt(S[0]);
            int C = Integer.parseInt(S[1]);
            int matrix[][] = new int[R][C];
            int c = 0;
            for(int i = 0; i < R; i++){
                String line[]=read.readLine().trim().split(" ");
                for(int j = 0; j < C; j++){
                    matrix[i][j] = Integer.parseInt(line[j]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.median(matrix, R, C);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    
    public int solve(int [][] matrix, int R, int C, int m){
        
        int count = 0;
        
        for(int i = 0 ; i < R ; i ++ ){
            
            int s = 0; int e = C - 1;
            
            while(s <= e){
                int mid = s + (e - s) / 2;
                if(matrix[i][mid] <= m){
                    s = mid + 1;
                }
                else{
                    e = mid - 1;
                }
            }
            count+=s;
        }
        return count;
        
    }
    
    int median(int matrix[][], int R, int C) {
        
        int s = 0;
        int e = Integer.MAX_VALUE - 2;
        
        
        while(s <= e){
            
            int mid = s + (e - s) / 2;
            
            int count = solve(matrix, R, C, mid);
            
            if(count <= (R*C) / 2){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        
        return s;
        
    }
}