//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    
    
    int[] findTwoElement(int arr[], int n) {

        int idx = 0;
        
        while(idx < n){
            int bidx = arr[idx] - 1;
            if(arr[idx] != arr[bidx]){
                int temp = arr[bidx];
                arr[bidx] = arr[idx];
                arr[idx] = temp;
            }
            else{
                idx++;
            }
        }
        
        for(int i = 0; i < n ; i ++){
            if(arr[i] - 1 != i ){
                return new int[]{arr[i], i +1}; 
            }
        }
        return new int[]{-1,-1};
    }
}