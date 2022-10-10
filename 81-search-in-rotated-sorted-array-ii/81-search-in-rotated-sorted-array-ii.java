class Solution {
    public boolean search(int[] arr, int target) {
        
        int s=0;
        int e=arr.length-1;
        
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[e]==target){
                return true;
            }
            if(arr[mid]==target){
                return true;
            }
            else if((arr[s] == arr[mid]) && (arr[e] == arr[mid]))
            {
                s++;
                e--;
            }
            else if(arr[mid]<=arr[e]){
                if(arr[mid]<target && arr[e]>=target){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
            else if(arr[mid]>=arr[s]){
                 if(arr[mid]>target && arr[s]<=target){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
                
            }
        }
        return false;
    }
}